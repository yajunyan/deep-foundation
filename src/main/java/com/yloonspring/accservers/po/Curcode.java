package com.yloonspring.accservers.po;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年8月26日 下午2:53:00
 * @ClassName Curcode
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Curcode {
	private String curcode;
	private String cursym;
	private int cursecunit;
	private String curchdesc;
	private String submitoper;
	private String memo;
	private String intime;
	private String modtime;

	public String getCurcode() {
		return curcode;
	}

	public void setCurcode(String curcode) {
		this.curcode = curcode;
	}

	public String getCursym() {
		return cursym;
	}

	public void setCursym(String cursym) {
		this.cursym = cursym;
	}

	public int getCursecunit() {
		return cursecunit;
	}

	public void setCursecunit(int cursecunit) {
		this.cursecunit = cursecunit;
	}

	public String getCurchdesc() {
		return curchdesc;
	}

	public void setCurchdesc(String curchdesc) {
		this.curchdesc = curchdesc;
	}

	public String getSubmitoper() {
		return submitoper;
	}

	public void setSubmitoper(String submitoper) {
		this.submitoper = submitoper;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getModtime() {
		return modtime;
	}

	public void setModtime(String modtime) {
		this.modtime = modtime;
	}

	@Override
	public String toString() {
		return "Curcode [curcode=" + curcode + ", cursym=" + cursym + ", cursecunit=" + cursecunit + ", curchdesc="
				+ curchdesc + ", submitoper=" + submitoper + ", memo=" + memo + ", intime=" + intime + ", modtime="
				+ modtime + "]";
	}

}
