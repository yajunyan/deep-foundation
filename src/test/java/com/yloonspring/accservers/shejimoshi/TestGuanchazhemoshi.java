package com.yloonspring.accservers.shejimoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月17日 下午3:46:25
 * @ClassName TestGuanchazhemoshi
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

import com.yloonspring.accservers.service.designmode.guanchazhe.BeiGuanChanZhe;
import com.yloonspring.accservers.service.designmode.guanchazhe.Guanchazhe1;
import com.yloonspring.accservers.service.designmode.guanchazhe.Guanchazhe2;
import com.yloonspring.accservers.service.designmode.guanchazhe.Guanchazhe3;

public class TestGuanchazhemoshi {
	@Test
	public void test01() {
		BeiGuanChanZhe beiGuanChanZhe = new BeiGuanChanZhe();

		Guanchazhe1 guanchazhe1 = new Guanchazhe1(beiGuanChanZhe);
		Guanchazhe2 guanchazhe2 = new Guanchazhe2(beiGuanChanZhe);
		Guanchazhe3 guanchazhe3 = new Guanchazhe3(beiGuanChanZhe);

		beiGuanChanZhe.setState(1);

		beiGuanChanZhe.setState(2);

	}
}
