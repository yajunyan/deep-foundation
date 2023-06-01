package com.yloonspring.accservers.service.designmode.danli;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月16日 下午8:08:25
 * @ClassName JingtaiNeiBuLeiDanli
 * @类描述-Description: 静态内部类单例模式
 * @修改记录:
 * @版本: 1.0
 */
public class JingtaiNeiBuLeiDanli {
	private static class SingletonHolder {
		private static final JingtaiNeiBuLeiDanli INSTANCE = new JingtaiNeiBuLeiDanli();
	}

	private JingtaiNeiBuLeiDanli() {
	}

	public static final JingtaiNeiBuLeiDanli getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
