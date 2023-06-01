package com.yloonspring.accservers.service.designmode.dailimoshi.dongtaidaili.cglib;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 上午11:15:58
 * @ClassName DongtaiProxyTest
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class DongtaiProxyTest {

	@Test
	public void testDynProxy() {
		// 代理类class文件存入本地磁盘方便我们反编译查看源码
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");

		Enhancer enhancer = new Enhancer();

		/* 设置目标类 */
		enhancer.setSuperclass(MyHello.class);

		/* 设置拦截器对象 */
		enhancer.setCallback(new MyInterceptor());

		/* 创建代理 */
		MyHello myhelloProxy = (MyHello) enhancer.create();

		// myhelloProxy.sayGoodBye("test");
		myhelloProxy.sayHello();

	}
}
