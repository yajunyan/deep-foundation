package com.yloonspring.accservers.service.kaifayuanze.dimitefaze.dimitefaze;

import java.util.ArrayList;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午5:50:34
 * @ClassName FenGongsi
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class FenGongsi {

	public ArrayList<FengongsiYuangong> getFengongsiYuangong() {
		ArrayList<FengongsiYuangong> list = new ArrayList<FengongsiYuangong>();

		for (int i = 0; i < 20; i++) {
			FengongsiYuangong zgs = new FengongsiYuangong();
			zgs.setId("分公司" + i);
			list.add(zgs);
		}

		return list;
	}

	public void printFengongsiYuangong() {
		ArrayList<FengongsiYuangong> list = this.getFengongsiYuangong();
		for (FengongsiYuangong fengongsiYuangong : list) {
			System.out.println("分公司" + fengongsiYuangong.getId());
		}
	}

}
