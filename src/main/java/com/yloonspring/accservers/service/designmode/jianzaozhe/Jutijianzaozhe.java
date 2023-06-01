package com.yloonspring.accservers.service.designmode.jianzaozhe;

import com.yloonspring.accservers.service.designmode.jianzaozhe.impl.Jutidehanbaobao;
import com.yloonspring.accservers.service.designmode.jianzaozhe.impl.Jutidehanbaobao1;
import com.yloonspring.accservers.service.designmode.jianzaozhe.impl.Jutilengyin;
import com.yloonspring.accservers.service.designmode.jianzaozhe.impl.Jutilengyin1;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月17日 下午3:59:57
 * @ClassName Jianlibutongdetaocan
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Jutijianzaozhe {
	public Zhihuizhe meal1() {
		Zhihuizhe meal = new Zhihuizhe();
		meal.addItem(new Jutidehanbaobao()); // 汉堡包
		meal.addItem(new Jutilengyin()); // 冷饮

		return meal; // 套餐1
	}

	public Zhihuizhe meal2() {
		Zhihuizhe meal2 = new Zhihuizhe();

		meal2.addItem(new Jutidehanbaobao1()); // 汉堡包
		meal2.addItem(new Jutilengyin1()); // 冷饮

		return meal2; // 套餐2
	}

	public Zhihuizhe meal3() {
		Zhihuizhe meal3 = new Zhihuizhe();

		meal3.addItem(new Jutidehanbaobao()); // 汉堡包
		meal3.addItem(new Jutilengyin1()); // 冷饮

		return meal3; // 套餐3
	}

	public Zhihuizhe meal4() {
		Zhihuizhe meal4 = new Zhihuizhe();

		meal4.addItem(new Jutidehanbaobao1()); // 汉堡包
		meal4.addItem(new Jutilengyin()); // 冷饮

		return meal4; // 套餐4
	}
}
