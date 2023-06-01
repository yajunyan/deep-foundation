package com.yloonspring.accservers.service.designmode.shipeiqimoshi.impl;

import com.yloonspring.accservers.service.designmode.shipeiqimoshi.adapter.MeitibofangShipeiqi;
import com.yloonspring.accservers.service.designmode.shipeiqimoshi.inter.Meitibofangqi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 下午6:00:13
 * @ClassName YinpinbofangqiNewImpl
 * @类描述-Description: 原功能要扩展使用新功能，则需要将适配器引入
 * @修改记录:
 * @版本: 1.0
 */
public class YinpinbofangqiNewImpl implements Meitibofangqi {

	/* 为原有的功能增加适配器类，来使用新功能 */
	MeitibofangShipeiqi meitibofangShipeiqi;

	@Override
	public void Play(String type, String name) {
		if (type.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. name: " + name);
		} else if (type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vcl")) {
			meitibofangShipeiqi = new MeitibofangShipeiqi(type);
			/* 通过适配器实现新功能的使用 */
			meitibofangShipeiqi.Play(type, name);
		} else {
			System.out.println("不支持的播放格式");
		}

	}

}
