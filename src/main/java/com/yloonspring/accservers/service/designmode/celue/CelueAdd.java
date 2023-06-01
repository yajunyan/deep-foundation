package com.yloonspring.accservers.service.designmode.celue;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月15日 下午2:46:24
 * @ClassName CelueAdd
 * @类描述-Description: 策略模式的重点是同一个接口方法，不同的类选择不同的行为方式
 * @修改记录:
 * @版本: 1.0
 */
public class CelueAdd implements CelueInterface {

	@Override
	public int doOperation(int a, int b) {

		return a + b;
	}

}
