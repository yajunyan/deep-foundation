package com.yloonspring.accservers.service.designmode.waiguanmoshi;

import org.junit.Test;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 下午8:30:33
 * @ClassName TestJiedaizhemoshi
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class TestJiedaizhemoshi {
	@Test
	public void TestJiedaizhe() {
		Jiedaizhemoshi jiedaizhemoshi = new Jiedaizhemoshi();

		jiedaizhemoshi.drawChangfangxing();
		jiedaizhemoshi.drawCircle();
		jiedaizhemoshi.drawZhengfangxing();
	}
}
