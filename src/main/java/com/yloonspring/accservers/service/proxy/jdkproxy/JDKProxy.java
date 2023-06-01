package com.yloonspring.accservers.service.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yanyajun@umpay.com
 * @版本: 1.0
 * @创建日期: 2021/1/8 17:34
 * @ClassName: JDKProxy
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
public class JDKProxy implements InvocationHandler {
     private Object targetObject;

public Object createProxyInstance(Object targetObject){
    this.targetObject = targetObject;
    return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
            this.targetObject.getClass().getInterfaces(), this);
}
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
