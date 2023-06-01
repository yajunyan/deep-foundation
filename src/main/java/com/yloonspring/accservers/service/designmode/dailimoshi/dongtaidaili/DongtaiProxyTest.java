package com.yloonspring.accservers.service.designmode.dailimoshi.dongtaidaili;

import java.lang.reflect.Proxy;

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

import com.yloonspring.accservers.service.designmode.dailimoshi.jingtaidaili.BuyHouse;
import com.yloonspring.accservers.service.designmode.dailimoshi.jingtaidaili.BuyHouseImpl;

public class DongtaiProxyTest {

	@Test
	public void testDynProxy() {
		BuyHouse buyHouse = new BuyHouseImpl();
		IHello hello = new IHelloImpl();
		/* jdk动态代理实现 */

		BuyHouse proxyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
				new Class[] { BuyHouse.class }, new DongtaiProxyHandler(buyHouse));

		proxyHouse.buyhouse();

		IHello proxyHello = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(), new Class[] { IHello.class },
				new DongtaiProxyHandler(hello));

		proxyHello.sayHello("test");
		proxyHello.sayGoodBye("test");
	}
}
