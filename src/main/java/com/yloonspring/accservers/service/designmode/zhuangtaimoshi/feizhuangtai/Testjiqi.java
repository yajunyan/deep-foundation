package com.yloonspring.accservers.service.designmode.zhuangtaimoshi.feizhuangtai;

import org.junit.Test;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月29日 下午8:28:01
 * @ClassName Test
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */

public class Testjiqi {
	@Test
	public void testjiqi() {
		TangGuoJiQi tanguoJiQi = new TangGuoJiQi(10);

		tanguoJiQi.insertMoney();
		tanguoJiQi.QuhuoQuest();
		tanguoJiQi.TuiqianQuest();

	}
}
