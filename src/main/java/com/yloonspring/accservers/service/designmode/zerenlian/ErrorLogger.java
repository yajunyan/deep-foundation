package com.yloonspring.accservers.service.designmode.zerenlian;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 下午8:51:19
 * @ClassName ConsoleLogger
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	void write(String message) {
		System.out.println("level:" + this.level + " ErrorLogger:" + message);

	}

}
