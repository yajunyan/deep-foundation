package com.yloonspring.accservers.zkservice;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/11/19 16:48
 * @ClassName: ZKClient
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
@Slf4j
@Data
@Resource
public class ZkClient {
    /**
    * curator包装器
    */
    private CuratorFramework client;

    /**
     *  zk服务
     */
    private String zookeeperServer;

    /**
     * session过期时间
     *  */
    private int sessionTimeoutMs;

    /**
     *  连接过期时间
     *  */
    private int connectionTimeoutMs;

    /**
     * 基础睡眠时间
     */
    private int baseSleepTimeMs;
    /**
     * 两次重试之间最大睡眠时间
     * */
    private int maxRetries;

    public void init(){
        /* 在重试策略上， Curator通过一个接口RetryPolicy来让用户实现自定义的重试策略 */
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(baseSleepTimeMs, maxRetries);
       client = CuratorFrameworkFactory.builder().connectString(zookeeperServer).retryPolicy(retryPolicy)
                .sessionTimeoutMs(sessionTimeoutMs).connectionTimeoutMs(connectionTimeoutMs).build();
       client.start();
    }

    public void stop(){
        client.close();
    }

    public CuratorFramework getClient(){
        return client;
    }

    public void register(){
        try{
            String rootPath="/"+"yloon";
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            String serviceInstance = "prometheus" + "-" + hostAddress + "-";
            client.create().creatingParentContainersIfNeeded().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath(
                    rootPath + "/" + serviceInstance);
        }catch (Exception e) {
            log.error("注册出错", e);
        }
    }

    public List<String> getChildren(String path) {
        List<String> childrenList = new ArrayList<>();
        try {
            childrenList = client.getChildren().forPath(path);
        } catch (Exception e) {
            log.error("获取子节点出错", e);
        }
        return childrenList;
    }

    public int getChildrenCount(String path) {
        return getChildren(path).size();
    }

    public List<String> getInstances() {
        return getChildren("/yloon");
    }

    public int getInstancesCount() {
        return getInstances().size();
    }


}
