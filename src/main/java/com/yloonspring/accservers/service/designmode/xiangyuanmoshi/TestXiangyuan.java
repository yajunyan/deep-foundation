package com.yloonspring.accservers.service.designmode.xiangyuanmoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午8:57:08
 * @ClassName TestXiangyuan
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

public class TestXiangyuan {
	private static final String colors[] = { "Red", "Black", "Blue", "White" };

	@Test
	public void TestXiangyuan1() {
		for (int i = 0; i < 20; i++) {
			Circle circle = ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius("100");
			circle.draw();
		}
	}

	public static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static String getRandomX() {
		return String.valueOf(Math.random() * 100);
	}

	private static String getRandomY() {
		return String.valueOf(Math.random() * 100);
	}
}
