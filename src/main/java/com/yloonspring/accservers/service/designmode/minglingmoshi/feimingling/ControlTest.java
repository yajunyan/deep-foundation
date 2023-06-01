package com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling;

import org.junit.Test;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午6:11:41
 * @ClassName ControlTest
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class ControlTest {

	@Test
	public void test() {
		Light light = new Light("RedLight");
		YingXiang yingXiang = new YingXiang();

		ControlMachine yaokongqi = new TradtionControl(light, yingXiang);

		/*
		 * 0-灯光开 1-音响开 2-增加音响声音
		 */
		yaokongqi.onButton(0);
		yaokongqi.offButton(1);
		yaokongqi.onButton(1);
		yaokongqi.offButton(0);
		yaokongqi.onButton(2);
		yaokongqi.offButton(2);

	}
}
