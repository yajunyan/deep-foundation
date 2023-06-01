package com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午5:46:33
 * @ClassName TradtionControl
 * @类描述-Description: 传统写代码的流程，非命令模式，控制器与被控制类的方法紧密耦合 如果增加被控制类的方法，控制器需要修改
 * @修改记录:
 * @版本: 1.0
 */
public class TradtionControl implements ControlMachine {

	public Light light;
	public YingXiang yingxiang;

	public TradtionControl(Light light, YingXiang yingXiang) {
		this.light = light;
		this.yingxiang = yingXiang;
	}

	/* 如果被调用者有新增方法或其他修改代码的操作,控制方法也需要进行修改,高耦合 */
	@Override
	public void onButton(int slot) {

		switch (slot) {
		case 0:
			light.lightOn("light");
			break;
		case 1:
			yingxiang.volOn();
			break;
		case 2:
			int vol = yingxiang.getVol();
			if (vol < 11) {
				yingxiang.setVol(++vol);
			}
			break;
		}

	}

	@Override
	public void offButton(int slot) {
		switch (slot) {
		case 0:
			light.lightOff("light");
			break;
		case 1:
			yingxiang.volOff();
			break;
		case 2:
			int vol = yingxiang.getVol();
			if (vol > 11) {
				yingxiang.setVol(--vol);
			}
			break;
		}

	}

}
