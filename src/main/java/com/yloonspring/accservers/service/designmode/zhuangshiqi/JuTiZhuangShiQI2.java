package com.yloonspring.accservers.service.designmode.zhuangshiqi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午2:47:22
 * @ClassName JuTiZhuangShiQI
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class JuTiZhuangShiQI2 extends ShapeZhuangShiQI {

	/* 每一个装饰器都要实现的构造方法，用来增加上一个装饰器的功能 ，迭代装饰器用 */
	public JuTiZhuangShiQI2(Shape shape) {
		/* 将传入的shape使用装饰器原生shape的行为进行赋值 */
		super(shape);
	}

	@Override
	public void draw() {
		// 核心点：每个装饰器都要调用父类的重构方法，再在父类重构方法的基础上增加自身的额外操作
		System.out.println("装饰器2drawstart");
		super.draw(); // 使用被装饰类的原生方法
		System.out.println("装饰器2drawend");
		setRedBorder(shape); // 增加装饰器装饰

	}

	private void setRedBorder(Shape shape) {
		System.out.println("增加红色边框");
	}
}
