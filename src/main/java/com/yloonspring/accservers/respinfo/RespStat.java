package com.yloonspring.accservers.respinfo;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年8月27日 下午2:37:40
 * @ClassName RespStat
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class RespStat {
	private int code;
	private String name;
	private String data;

	public RespStat() {
		super();
	}

	public RespStat(int code, String name, String data) {
		super();
		this.code = code;
		this.name = name;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
