package com.yloonspring.accservers.service.designmode.gongchang.jiandangongchang;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月16日 下午4:21:07
 * @ClassName GongchangfangfaFactory
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class GongchangfangfaCarFactory {
	public Car createCar() {
		System.out.println("..........start");
		Car car = new Car();
		System.out.println("..........end");
		return car;
	}
}
