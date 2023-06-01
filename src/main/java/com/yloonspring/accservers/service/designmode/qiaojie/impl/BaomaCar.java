package com.yloonspring.accservers.service.designmode.qiaojie.impl;

import com.yloonspring.accservers.service.designmode.qiaojie.inter.AbstrctCar;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午2:41:28
 * @ClassName BaomaCar
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class BaomaCar extends AbstrctCar {

	@Override
	public void run() {
		bianshuxiang.gear();
		System.out.println("Baoma is running");

	}

}
