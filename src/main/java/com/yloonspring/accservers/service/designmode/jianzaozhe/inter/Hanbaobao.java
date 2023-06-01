package com.yloonspring.accservers.service.designmode.jianzaozhe.inter;

import com.yloonspring.accservers.service.designmode.jianzaozhe.impl.Zhibaozhuang;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月17日 下午3:17:31
 * @ClassName Hanbaobao
 * @类描述-Description: 二级抽象产品
 * @修改记录:
 * @版本: 1.0
 */
public abstract class Hanbaobao implements Chouxiangchanpin {
	@Override
	public Packing packing() {
		return new Zhibaozhuang(); // 默认汉堡包由纸质包装
	}

	@Override
	public abstract float price(); // 价格由具体的汉堡包设置价格
}
