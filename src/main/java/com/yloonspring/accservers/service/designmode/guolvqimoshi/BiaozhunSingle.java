package com.yloonspring.accservers.service.designmode.guolvqimoshi;

import java.util.ArrayList;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月23日 下午5:56:08
 * @ClassName BiaozhunMale
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class BiaozhunSingle implements Chouxiangbiaozhun {

	@Override
	public ArrayList<Person> manzuBiaozhun(ArrayList<Person> persons) {
		/* 开始过滤 */
		ArrayList<Person> personList = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getHunyin().equalsIgnoreCase("SINGLE")) {
				personList.add(person);
			}
		}
		return personList;
	}

}
