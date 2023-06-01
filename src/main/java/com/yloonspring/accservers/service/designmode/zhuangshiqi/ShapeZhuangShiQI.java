package com.yloonspring.accservers.service.designmode.zhuangshiqi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午2:41:51
 * @ClassName ShapeZhuangShiQI
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public abstract class ShapeZhuangShiQI implements Shape {
	protected Shape shape;

	/* 每个父类的装饰器都要 */
	public ShapeZhuangShiQI(Shape shape) {
		this.shape = shape;
	}

	/* 装饰器模式在于使用完原生的draw方法后，还会再增加其他的方法进行修饰 */

	@Override
	public void draw() {
		System.out.println(shape);
		shape.draw();
	}
}
