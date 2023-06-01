package com.yloonspring.accservers.service.designmode.dailimoshi.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 上午11:06:56
 * @ClassName DongtaiProxyHandler
 * @类描述-Description: 1、实现自己的invocationHandler
 * @修改记录:
 * @版本: 1.0
 */
public class DongtaiProxyHandler implements InvocationHandler {

	private Object target;

	public DongtaiProxyHandler(Object object) {
		this.target = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("插入前置通知。。。");
		Object result = method.invoke(target, args);
		System.out.println("插入后置通知。。。");
		return result;
	}

}
