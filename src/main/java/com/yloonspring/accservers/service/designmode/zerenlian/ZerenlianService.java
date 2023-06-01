package com.yloonspring.accservers.service.designmode.zerenlian;

import org.junit.Test;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 下午9:00:39
 * @ClassName ZerenlianService
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class ZerenlianService {
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger consLogger = new ConsoleLogger(1);
		AbstractLogger errorLogger = new ErrorLogger(2);
		AbstractLogger fileLogger = new FileLogger(3);

		consLogger.setNextLogger(errorLogger);
		errorLogger.setNextLogger(fileLogger);
		return consLogger;
	}

	@Test
	public void test() {
		AbstractLogger logger = getChainOfLoggers();
		logger.logMessage(AbstractLogger.INFO, "infoname");
		System.out.println("---------------------------------");
		logger.logMessage(AbstractLogger.DEBUG, "debugname");
		System.out.println("---------------------------------");
		logger.logMessage(AbstractLogger.ERROR, "errorname");
	}
}
