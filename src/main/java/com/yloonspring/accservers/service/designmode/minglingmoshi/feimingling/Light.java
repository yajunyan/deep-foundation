package com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午5:20:14
 * @ClassName Light
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Light {
	private String loc = "";

	public Light(String loc) {
		this.loc = loc;
	}

	/* 电灯开 */
	public void lightOn(String loc) {
		System.out.println(loc + " On");
	}

	/* 电灯关闭 */
	public void lightOff(String loc) {
		System.out.println(loc + " Off");
	}
}
