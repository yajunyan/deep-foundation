package com.yloonspring.accservers.service.designmode.celue;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月15日 下午2:47:08
 * @ClassName CelueSub
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class CelueSub implements CelueInterface {

	@Override
	public int doOperation(int a, int b) {
		return a - b;
	}

}
