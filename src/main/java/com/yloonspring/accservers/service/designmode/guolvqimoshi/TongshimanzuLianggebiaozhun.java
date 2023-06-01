package com.yloonspring.accservers.service.designmode.guolvqimoshi;

import java.util.ArrayList;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月23日 下午6:05:12
 * @ClassName TongshimanzuLianggebiaozhun
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class TongshimanzuLianggebiaozhun implements Chouxiangbiaozhun {

	Chouxiangbiaozhun biaozhun1;
	Chouxiangbiaozhun biaozhun2;

	public TongshimanzuLianggebiaozhun(Chouxiangbiaozhun biaozhun1, Chouxiangbiaozhun biaozhun2) {
		this.biaozhun1 = biaozhun1;
		this.biaozhun2 = biaozhun2;
	}

	@Override
	public ArrayList<Person> manzuBiaozhun(ArrayList<Person> person) {
		/* 满足标准1 */
		ArrayList<Person> persons = biaozhun1.manzuBiaozhun(person);
		/* 再满足标准2 */
		return biaozhun2.manzuBiaozhun(persons);
	}

}
