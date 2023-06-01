package com.yloonspring.accservers.service.designmode.zhuangshiqi;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午5:02:01
 * @ClassName TestZhuangShiqi
 * @类描述-Description:装饰器实现核心：装饰器和被装饰器都要继承自同一个抽象接口
 *                                                       通过在装饰器中引入被装饰器类，增加额外的操作来操作对原被装饰器的装饰。
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

public class TestZhuangShiqi {
	@Test
	public void testZhuangshiqi() {
		/* 被装饰者 */
		Shape circle = new Circle();

		/* 装饰者1 */
		/* 第一层装饰 */
		/*
		 * 逻辑：将被装饰者传入一个具体的装饰器里，在重写的方法中，调用被装饰者的某个方法后， 再增加想要装饰的内容
		 */
		ShapeZhuangShiQI shapeZhuangShiQI = new JuTiZhuangShiQI(circle);
		// shapeZhuangShiQI.draw();

		/* 第二层装饰 */
		/*
		 * 第二层装饰器传入第一个装饰器，调用第一个被装饰者的某个方法，再增加想要的装饰内容
		 * 这样，每个装饰器在装饰之前都会调用上一层装饰写的方法，再加上自身的扩展，达到不断装饰的过程
		 */
		ShapeZhuangShiQI shapeZhuangShiQI2 = new JuTiZhuangShiQI2(shapeZhuangShiQI);

		/* 第三层装饰 */
		/* 不断叠加装饰方法 */
		ShapeZhuangShiQI shapeZhuangShiQI3 = new JuTiZhuangShiQI3(shapeZhuangShiQI2);

		shapeZhuangShiQI3.draw();
	}

}
