package com.yloonspring.accservers.service.designmode.zuhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月26日 上午11:21:49
 * @ClassName Employee
 * @类描述-Description: 1、您想表示对象的部分-整体层次结构（树形结构）。
 *                   2、您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 * @修改记录:
 * @版本: 1.0
 */
public class Employee {
	private String name;
	private String dept;
	private String salary;

	/* 组合模式核心 */
	private List<Employee> subordinates;

	/* 构造方法 */
	public Employee(String name, String dept, String salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;

		subordinates = new ArrayList<Employee>();
	}

	/* 增加增删改查列表数据 */
	public void add(Employee employee) {
		subordinates.add(employee);
	}

	public void remove(Employee employee) {
		subordinates.remove(employee);
	}

	public List<Employee> getSubEmployees() {
		return subordinates;
	}

	@Override
	public String toString() {
		return ("Employee:[ name: " + name + ",dept: " + dept + ",salary: " + salary + " ]");
	}

}
