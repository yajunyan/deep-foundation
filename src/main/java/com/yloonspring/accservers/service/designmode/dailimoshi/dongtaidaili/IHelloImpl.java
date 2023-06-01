package com.yloonspring.accservers.service.designmode.dailimoshi.dongtaidaili;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 上午10:47:59
 * @ClassName BuyHouseImpl
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class IHelloImpl implements IHello {

	@Override
	public void sayHello(String name) {
		System.out.println("say hello " + name);
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println("say goodbye " + name);
	}

}
