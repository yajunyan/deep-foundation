package com.yloonspring.accservers.service.designmode.dailimoshi.jingtaidaili;

import org.junit.Test;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 上午10:53:26
 * @ClassName TestJingdaidaili
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class TestJingdaidaili {

	@Test
	public void testJtdl() {
		/* 真实类 */
		BuyHouse buyhouse = new BuyHouseImpl();
		/* 代理类 */
		BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyhouse);

		buyHouseProxy.buyhouse();
	}
}
