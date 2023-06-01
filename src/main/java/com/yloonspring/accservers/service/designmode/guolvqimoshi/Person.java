package com.yloonspring.accservers.service.designmode.guolvqimoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月23日 下午5:53:12
 * @ClassName Person
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Person {
	private String name;
	private String xingbie;
	private String hunyin;

	Person(String name, String xingbie, String hunyin) {
		this.name = name;
		this.xingbie = xingbie;
		this.hunyin = hunyin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	public String getHunyin() {
		return hunyin;
	}

	public void setHunyin(String hunyin) {
		this.hunyin = hunyin;
	}
}
