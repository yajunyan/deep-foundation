package com.yloonspring.accservers.service.designmode.shipeiqimoshi.adapter;

import com.yloonspring.accservers.service.designmode.shipeiqimoshi.impl.Mp4Play;
import com.yloonspring.accservers.service.designmode.shipeiqimoshi.impl.VlcPlay;
import com.yloonspring.accservers.service.designmode.shipeiqimoshi.inter.Meitibofangqi;
import com.yloonspring.accservers.service.designmode.shipeiqimoshi.inter.Zuixinbofangqi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 下午4:51:42
 * @ClassName MeitibofangShipeiqi
 * @类描述-Description: 媒体播放器适配器，增加了对最新播放格式能力的支持
 * @修改记录:
 * @版本: 1.0
 */
public class MeitibofangShipeiqi implements Meitibofangqi {

	Zuixinbofangqi zuixinbofangqi;

	public MeitibofangShipeiqi(String type) {
		if (type.equals("mp4")) {
			zuixinbofangqi = new Mp4Play();
		} else if (type.equals("vcl")) {
			zuixinbofangqi = new VlcPlay();
		}
	}

	@Override
	public void Play(String type, String name) {
		if (type.equalsIgnoreCase("mp4")) {
			zuixinbofangqi.playMp4(name);
		} else if (type.equalsIgnoreCase("vcl")) {
			zuixinbofangqi.playVcl(name);
		}
	}

}
