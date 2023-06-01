package com.yloonspring.accservers.service.designmode.danli;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月16日 下午8:04:52
 * @ClassName ShuangChongJIanChaDanli
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class ShuangChongJIanChaDanli {
	private static ShuangChongJIanChaDanli instance;

	private ShuangChongJIanChaDanli() {
	}

	public static ShuangChongJIanChaDanli getInstance() {
		if (instance == null) {
			synchronized (ShuangChongJIanChaDanli.class) {
				if (instance == null) {
					instance = new ShuangChongJIanChaDanli();
				}
			}
		}

		return instance;
	}
}
