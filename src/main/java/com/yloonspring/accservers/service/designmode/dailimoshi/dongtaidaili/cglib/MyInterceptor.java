package com.yloonspring.accservers.service.designmode.dailimoshi.dongtaidaili.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 下午4:58:49
 * @ClassName MyInterceptor
 * @类描述-Description: cglib动态代理
 * @修改记录:
 * @版本: 1.0
 */
public class MyInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object sub, Method method, Object[] objects, MethodProxy MethodProxy) throws Throwable {
		System.out.println("前置通知或操作...");
		Object result = MethodProxy.invoke(sub, objects);
		System.out.println("后置通知或操作");
		return result;
	}

}
