package com.yloonspring.accservers.dubboservice;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2021/12/13 18:21
 * @ClassName: MyDubboServiceImpl
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
@DubboService
public class MyDubboServiceImpl  implements  MyDubboService{

    @Value("${mydubbo.service.name}")
    private String serviceName;

    @Override
    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();

        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
