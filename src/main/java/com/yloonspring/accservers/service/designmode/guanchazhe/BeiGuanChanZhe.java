package com.yloonspring.accservers.service.designmode.guanchazhe;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月17日 下午3:16:50
 * @ClassName BeiGuanChanZhe
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import java.util.ArrayList;

public class BeiGuanChanZhe {
	/* 定义观察者列表 */
	ArrayList<MyObserver> observers = new ArrayList<MyObserver>();

	/* 定义被观察者的状态 */
	private int state;

	/* 增加观察者方法 */
	public void acctch(MyObserver observer) {
		observers.add(observer);
	}

	/* 如果发生被观察者状态发生改变则通知所有的观察者 */
	public void notifyObservers() {
		for (MyObserver observer : observers) {
			observer.update();
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		/* 核心点:主动通知 观察者得到通知后 可以做对应的事件 */
		notifyObservers();
	}
}
