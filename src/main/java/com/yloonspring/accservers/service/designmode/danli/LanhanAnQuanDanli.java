package com.yloonspring.accservers.service.designmode.danli;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月16日 下午7:16:25
 * @ClassName LanhanAnQuanDanli
 * @类描述-Description: 线程安全的懒汉单例模式
 * @修改记录:
 * @版本: 1.0
 */
public class LanhanAnQuanDanli {

	private static LanhanAnQuanDanli instance;

	/* 通过synchronized关键字实现原子操作 */
	public static synchronized LanhanAnQuanDanli getInstance() {
		if (instance == null) {
			instance = new LanhanAnQuanDanli();
		}

		return instance;
	}

}
