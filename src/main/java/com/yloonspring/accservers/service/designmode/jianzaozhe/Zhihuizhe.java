package com.yloonspring.accservers.service.designmode.jianzaozhe;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月17日 下午3:42:35
 * @ClassName Gezhongtiaomuwucan
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import java.util.ArrayList;
import java.util.List;

import com.yloonspring.accservers.service.designmode.jianzaozhe.inter.Chouxiangchanpin;

public class Zhihuizhe {
	private List<Chouxiangchanpin> items = new ArrayList<Chouxiangchanpin>();

	private String taocanName;

	public void setTaocanName(String taocanName) {
		this.taocanName = taocanName;
	}

	public String getTaocanName() {
		return this.taocanName;
	}

	/* 增加套餐的组成 */
	public void addItem(Chouxiangchanpin item) {
		items.add(item);
	}

	/* 获取此种套餐的总价 */
	public float getCost() {
		float cost = 0.0f;
		for (Chouxiangchanpin item : items) {
			cost = cost + item.price();
		}
		return cost;
	}

	/* 展示套餐的各个组成 */
	public void showItems() {
		for (Chouxiangchanpin item : items) {
			System.out.print(item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
