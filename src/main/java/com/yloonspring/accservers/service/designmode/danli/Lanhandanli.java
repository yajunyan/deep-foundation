package com.yloonspring.accservers.service.designmode.danli;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月16日 下午7:11:52
 * @ClassName Lanhandanli
 * @类描述:懒汉模式，线程不安全
 * @修改记录:
 * @版本: 1.0
 */
public class Lanhandanli {
	private static Lanhandanli instance;

	private Lanhandanli() {
	}

	public static Lanhandanli getInstance() {
		if (instance == null) {
			instance = new Lanhandanli();
		}

		return instance;
	}
}
