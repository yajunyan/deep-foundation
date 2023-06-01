package com.yloonspring.accservers.service.designmode.guolvqimoshi;

import java.util.ArrayList;

import org.junit.Test;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月23日 下午6:09:21
 * @ClassName TestGuolvqi
 * @类描述-Description: 一系列的某个列表，过滤出某些想要的子列表数据
 * @修改记录:
 * @版本: 1.0
 */
public class TestGuolvqi {
	@Test
	public void Test() {
		Person p1 = new Person("1", "male", "single");
		Person p2 = new Person("2", "female", "single");
		Person p3 = new Person("3", "male", "yihun");
		Person p4 = new Person("4", "female", "single");
		Person p5 = new Person("5", "female", "yihun");
		Person p6 = new Person("6", "male", "yihun");

		ArrayList<Person> persons = new ArrayList<Person>();

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);

		Chouxiangbiaozhun b1 = new BiaozhunMale();
		Chouxiangbiaozhun b2 = new BiaozhunFemale();
		Chouxiangbiaozhun b3 = new BiaozhunSingle();

		Chouxiangbiaozhun b4 = new TongshimanzuLianggebiaozhun(b1, b3);

		Chouxiangbiaozhun b5 = new TongshimanzuLianggebiaozhun(b2, b3);
		System.out.println("\n Male:");
		printPersons(b1.manzuBiaozhun(persons));
		System.out.println("\n FeMale:");
		printPersons(b2.manzuBiaozhun(persons));
		System.out.println("\n Single:");
		printPersons(b3.manzuBiaozhun(persons));
		System.out.println("\n Male Single:");
		printPersons(b4.manzuBiaozhun(persons));
		System.out.println("\n FeMale Single:");
		printPersons(b5.manzuBiaozhun(persons));

	}

	public static void printPersons(ArrayList<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Xingbie : " + person.getXingbie()
					+ ", Marital Status : " + person.getHunyin() + " ]");
		}
	}
}
