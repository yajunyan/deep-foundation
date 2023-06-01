package com.yloonspring.accservers.service.designmode.shipeiqimoshi.impl;

import com.yloonspring.accservers.service.designmode.shipeiqimoshi.inter.Zuixinbofangqi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 下午4:48:00
 * @ClassName Mp4Play
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Mp4Play implements Zuixinbofangqi {

	@Override
	public void playVcl(String name) {
		System.out.println("Play vcl, name: " + name);
	}

	@Override
	public void playMp4(String name) {
		System.out.println("Play mp4, name: " + name);

	}

}
