package com.yloonspring.accservers.service.designmode.shipeiqimoshi;

import org.junit.Test;

import com.yloonspring.accservers.service.designmode.shipeiqimoshi.impl.YinpinbofangqiNewImpl;
import com.yloonspring.accservers.service.designmode.shipeiqimoshi.inter.Meitibofangqi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 下午4:35:19
 * @ClassName ShipeiqiService
 * @类描述-Description: 适配器的核心，需要建立一个适配器类，融合原接口方法，根据入参扩展到新接口功能
 *                   原功能要扩展使用新功能，则需要将适配器引入
 *                   将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * @修改记录:
 * @版本: 1.0
 */
public class ShipeiqiService {

	@Test
	public void testShipeiqimoshi() {
		Meitibofangqi meitibofangqi = new YinpinbofangqiNewImpl();
		meitibofangqi.Play("mp4", "hh");
		meitibofangqi.Play("mp3", "ss");
		meitibofangqi.Play("vcl", "vls");

	}
}
