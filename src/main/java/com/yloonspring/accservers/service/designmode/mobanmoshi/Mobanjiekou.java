package com.yloonspring.accservers.service.designmode.mobanmoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午8:49:23
 * @ClassName Mobanjiekou
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public abstract class Mobanjiekou {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// 模板
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
