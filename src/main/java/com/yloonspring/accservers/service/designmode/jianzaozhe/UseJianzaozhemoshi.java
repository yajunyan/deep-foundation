package com.yloonspring.accservers.service.designmode.jianzaozhe;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月17日 下午4:15:53
 * @ClassName UseJianzaozhemoshi
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class UseJianzaozhemoshi {
	public void TigongWucan() {
		Jutijianzaozhe taocans = new Jutijianzaozhe();

		Zhihuizhe taocan1 = taocans.meal1();
		taocan1.showItems();

		Zhihuizhe taocan2 = taocans.meal2();
		taocan2.showItems();

		Zhihuizhe taocan3 = taocans.meal3();
		taocan3.showItems();

		Zhihuizhe taocan4 = taocans.meal4();
		taocan4.showItems();

	}
}
