package com.yloonspring.accservers.service.designmode.xiangyuanmoshi;

import java.util.HashMap;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午8:43:41
 * @ClassName Xiangyuanmoshi
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class ShapeFactory {
	private static final HashMap<String, Shape> circleShape = new HashMap<String, Shape>();

	public static Circle getCircle(String color) {
		/* 享元模式，将某些多个具体相同属性的类放入缓存中，每次使用如果从缓存中找到则直接使用，如果没有找到则创建 */
		Circle circle = (Circle) circleShape.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleShape.put(color, circle);
			System.out.println("Create Circle: " + color);
			return circle;
		} else {
			return circle;
		}
	}

}
