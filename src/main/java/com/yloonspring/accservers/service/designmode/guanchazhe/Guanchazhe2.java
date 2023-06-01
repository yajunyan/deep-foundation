package com.yloonspring.accservers.service.designmode.guanchazhe;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月17日 下午3:35:16
 * @ClassName Guanchazhe1
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Guanchazhe2 extends MyObserver {

	/* 将观察者通过构造方法放入观察者队列中 */
	public Guanchazhe2(BeiGuanChanZhe beiGuanChanZhe) {
		this.beiGuanChanZhe = beiGuanChanZhe;
		beiGuanChanZhe.acctch(this);
	}

	@Override
	public void update() {
		System.out.println("guanchazhe2 get state:" + beiGuanChanZhe.getState());
	}

}
