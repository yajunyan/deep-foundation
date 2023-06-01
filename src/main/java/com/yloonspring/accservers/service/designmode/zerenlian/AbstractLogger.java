package com.yloonspring.accservers.service.designmode.zerenlian;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月27日 下午8:42:41
 * @ClassName AbstractLogger
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	/* 责任链模式的下一个元素 */
	protected AbstractLogger nextLogger;

	/* 获取下一个责任者 */
	protected void setNextLogger(AbstractLogger nextlogger) {
		this.nextLogger = nextlogger;
	}

	/* 打印日志并通知下一个责任者 */
	public void logMessage(int level, String message) {
		/* 如果输入的level和本层所设置的level小或相等，则记录日志 */
		if (this.level <= level) {
			write(message);
		}
		/* 下一个责任职责 */
		if (this.nextLogger != null) {
			this.nextLogger.logMessage(level, message);
		}
	}

	abstract void write(String message);
}
