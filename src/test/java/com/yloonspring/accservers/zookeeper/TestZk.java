package com.yloonspring.accservers.zookeeper;

import com.alibaba.nacos.shaded.org.checkerframework.common.value.qual.StaticallyExecutable;
import com.yloonspring.accservers.zkservice.ZkClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/11/19 18:34
 * @ClassName: TestZk
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class TestZk {

    @Autowired
    ZkClient  zkClient;

    @Test
    public void testZkClient(){
       // zkClient.register();
    }
}
