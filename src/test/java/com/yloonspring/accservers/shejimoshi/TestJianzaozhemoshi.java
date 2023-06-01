package com.yloonspring.accservers.shejimoshi;

import org.junit.Test;

import com.yloonspring.accservers.service.designmode.jianzaozhe.Zhihuizhe;
import com.yloonspring.accservers.service.designmode.jianzaozhe.Jutijianzaozhe;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月17日 下午4:21:56
 * @ClassName TestJianzaozhemoshi
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class TestJianzaozhemoshi {

	@Test
	public void TigongWucan() {
		Jutijianzaozhe taocans = new Jutijianzaozhe();

		Zhihuizhe taocan1 = taocans.meal1();
		taocan1.showItems();
		System.out.println("taocan1 price: " + taocan1.getCost());
		Zhihuizhe taocan2 = taocans.meal2();
		taocan2.showItems();
		System.out.println("taocan2 price: " + taocan2.getCost());
		Zhihuizhe taocan3 = taocans.meal3();
		taocan3.showItems();
		System.out.println("taocan3 price: " + taocan3.getCost());
		Zhihuizhe taocan4 = taocans.meal4();
		taocan4.showItems();
		System.out.println("taocan4 price: " + taocan4.getCost());

	}

}
