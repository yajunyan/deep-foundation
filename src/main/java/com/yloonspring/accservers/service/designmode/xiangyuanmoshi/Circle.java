package com.yloonspring.accservers.service.designmode.xiangyuanmoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午8:41:09
 * @ClassName Circle
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Circle implements Shape {
	private String color;
	private String x;
	private String y;
	private String radius;

	public Circle(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle [color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + "]");

	}

	@Override
	public String toString() {
		return "Circle [color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}

}
