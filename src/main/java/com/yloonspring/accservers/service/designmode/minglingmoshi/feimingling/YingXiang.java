package com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午5:33:20
 * @ClassName YingXiang
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class YingXiang {
	public static int volunm = 0;

	public void volOn() {
		System.out.println("Yingxiang on");
	}

	public void volOff() {
		System.out.println("Yingxiang off");
	}

	public void setVol(int vol) {
		volunm = vol;
		System.out.println("Yingxiang volum=" + vol);
	}

	public int getVol() {
		return volunm;
	}

	public void setCD() {
		System.out.println("Yingxiang set CD");
	}
}
