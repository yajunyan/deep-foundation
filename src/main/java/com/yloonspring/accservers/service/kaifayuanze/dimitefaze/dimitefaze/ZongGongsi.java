package com.yloonspring.accservers.service.kaifayuanze.dimitefaze.dimitefaze;

import java.util.ArrayList;

public class ZongGongsi {

	public ArrayList<ZonggongsiYuangong> getZonggongsiYuangong() {
		ArrayList<ZonggongsiYuangong> list = new ArrayList<ZonggongsiYuangong>();

		for (int i = 0; i < 20; i++) {
			ZonggongsiYuangong zgs = new ZonggongsiYuangong();
			zgs.setId("总公司" + i);
			list.add(zgs);
		}

		return list;

	}

	public void printZonggongsiYuangong() {

		ArrayList<ZonggongsiYuangong> list2 = this.getZonggongsiYuangong();
		for (ZonggongsiYuangong e : list2) {
			System.out.println(e.getId());

		}
	}

	public void printAllYuangong(FenGongsi fengongsi) {
//		ArrayList<ZonggongsiYuangong> list2 = this.getZonggongsiYuangong();
//		for (ZonggongsiYuangong e : list2) {
//			System.out.println(e.getId());
//
//		}
//
//		ArrayList<FengongsiYuangong> list1 = fengongsi.getFengongsiYuangong();
//		for (FengongsiYuangong e : list1) {
//			System.out.println(e.getId());
//
//		}
		this.printZonggongsiYuangong();
		fengongsi.printFengongsiYuangong();

	}
}
