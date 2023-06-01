package com.yloonspring.accservers.service.designmode.yuanxingmoshi.impl;

import com.yloonspring.accservers.service.designmode.yuanxingmoshi.inter.Shape;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 上午11:24:41
 * @ClassName Zhengfangxing
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Zhengfangxing extends Shape {

	public Zhengfangxing() {
		this.type = "zhengfangxing";
	}

	@Override
	public void draw() {
		System.out.println("Zhengfangxing draw()");
	}

}
