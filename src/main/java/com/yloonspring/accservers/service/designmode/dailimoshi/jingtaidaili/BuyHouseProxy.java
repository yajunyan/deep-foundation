package com.yloonspring.accservers.service.designmode.dailimoshi.jingtaidaili;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 上午10:49:14
 * @ClassName BuyHouseProxy
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class BuyHouseProxy implements BuyHouse {
	private BuyHouse buyhouse;

	public BuyHouseProxy(final BuyHouse buyhouse) {
		this.buyhouse = buyhouse;
	}

	@Override
	public void buyhouse() {
		System.out.println("买房前准备");
		buyhouse.buyhouse();
		System.out.println("买房后装修");

	}

}
