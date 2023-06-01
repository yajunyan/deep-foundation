package com.yloonspring.accservers.service.designmode.waiguanmoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午8:23:37
 * @ClassName Jiedaizhemoshi
 * @类描述-Description:  核心思想：
 * 	当外部客户端对一个内部系统各个部件不了解时候，服务端可以提供一个对外的实例类去告诉外部系统哪些具备哪些功能
 * 	来实现外部系统无需知道内部各个部件就可以直接使用这个复杂的内部系统功能
 * @修改记录:
 * @版本: 1.0
 */

import com.yloonspring.accservers.service.designmode.yuanxingmoshi.impl.Changfangxing;
import com.yloonspring.accservers.service.designmode.yuanxingmoshi.impl.Zhengfangxing;
import com.yloonspring.accservers.service.designmode.zhuangshiqi.Circle;

public class Jiedaizhemoshi {
	private Circle circle;
	private Zhengfangxing zhengfangxing;
	private Changfangxing changfangxing;

	public Jiedaizhemoshi() {
		circle = new Circle();
		zhengfangxing = new Zhengfangxing();
		changfangxing = new Changfangxing();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawZhengfangxing() {
		zhengfangxing.draw();
	}

	public void drawChangfangxing() {
		changfangxing.draw();
	}
}
