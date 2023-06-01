package com.yloonspring.accservers.service.designmode.jianzaozhe.inter;

import com.yloonspring.accservers.service.designmode.jianzaozhe.impl.PingziBaozhuang;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月17日 下午3:37:00
 * @ClassName Lengyin
 * @类描述-Description: 二级抽象产品
 * @修改记录:
 * @版本: 1.0
 */
public abstract class Lengyin implements Chouxiangchanpin {

	@Override
	public Packing packing() {
		return new PingziBaozhuang();
	}

	@Override
	public abstract float price();

}
