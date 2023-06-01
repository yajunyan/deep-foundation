package com.yloonspring.accservers.service.designmode.qiaojie.inter;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午2:29:17
 * @ClassName AbstrctCar
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public abstract class AbstrctCar {
	protected BiansuxiangInter bianshuxiang;

	public BiansuxiangInter getBianshuxiang() {
		return bianshuxiang;
	}

	public void setBianshuxiang(BiansuxiangInter bianshuxiang) {
		this.bianshuxiang = bianshuxiang;
	}

	public abstract void run();

}
