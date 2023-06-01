package com.yloonspring.accservers.service.designmode.zuhemoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 上午11:42:46
 * @ClassName ZuhemoshiService
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

public class ZuhemoshiService {
	@Test
	public void testZuhe() {
		Employee zongcai = new Employee("zongcai", "zongcai", "10000000");
		Employee jingli = new Employee("jiangli", "jingli", "200000");
		Employee jingli1 = new Employee("jiangli", "jingli", "200000");

		Employee guyuan = new Employee("guyuan", "guyuan", "30000");
		Employee guyuan1 = new Employee("guyuan", "guyuan", "40000");
		Employee guyuan2 = new Employee("guyuan", "guyuan", "50000");

		zongcai.add(jingli);
		zongcai.add(jingli1);

		jingli.add(guyuan);
		jingli.add(guyuan1);

		jingli1.add(guyuan2);

		System.out.println(zongcai);
		for (Employee employee : zongcai.getSubEmployees()) {
			System.out.println(employee);
			for (Employee employee2 : employee.getSubEmployees()) {
				System.out.println(employee2);
			}
		}
	}
}
