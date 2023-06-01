package com.yloonspring.accservers.service.designmode.yuanxingmoshi.inter;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 上午11:10:02
 * @ClassName Shape
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void draw();

	@Override
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}
}
