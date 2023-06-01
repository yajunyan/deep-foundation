package com.yloonspring.accservers.service.designmode.gongchang.jiandangongchang;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月16日 下午5:14:05
 * @ClassName Wepanfactory
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Manfactory extends Abstractfactory {

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		return new Bread();
	}

	@Override
	public Wepan createWepan() {
		// TODO Auto-generated method stub
		return new AK47();
	}

	@Override
	public Jiaotong createJiaotong() {
		// TODO Auto-generated method stub
		return null;
	}

}
