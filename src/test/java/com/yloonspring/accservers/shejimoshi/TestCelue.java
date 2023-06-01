package com.yloonspring.accservers.shejimoshi;

import org.junit.Test;

import com.yloonspring.accservers.service.designmode.celue.CelueAdd;
import com.yloonspring.accservers.service.designmode.celue.CelueInterface;
import com.yloonspring.accservers.service.designmode.celue.CelueSub;
import com.yloonspring.accservers.service.designmode.celue.ShiyongCelue;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月15日 下午3:41:06
 * @ClassName TestCelue
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class TestCelue {

	@Test
	public void test01() {
		CelueInterface celadd = new CelueAdd();
		CelueInterface celsub = new CelueSub();

		ShiyongCelue celue = new ShiyongCelue(celadd);
		System.out.println("add: " + celue.executeCelue(1, 2));
		ShiyongCelue celue1 = new ShiyongCelue(celsub);
		System.out.println("sub: " + celue1.executeCelue(1, 2));
	}
}
