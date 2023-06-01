package com.yloonspring.accservers.service.designmode.dailimoshi.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 下午4:33:48
 * @ClassName IHelloHandler
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class IHelloHandler implements InvocationHandler {

	private Object target;

	public IHelloHandler(Object object) {
		this.target = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("组装前置流程");
		Object result = method.invoke(target, args);
		System.out.println("组装后置流程");
		return result;
	}

}
