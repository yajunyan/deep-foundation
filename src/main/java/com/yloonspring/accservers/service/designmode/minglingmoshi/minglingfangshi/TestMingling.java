package com.yloonspring.accservers.service.designmode.minglingmoshi.minglingfangshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午8:07:07
 * @ClassName TestMingling
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

import com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling.Light;
import com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling.YingXiang;

public class TestMingling {
	@Test
	public void testMingling() {
		/* 命令模式控制器(遥控器) */
		CommandModelControl control = new CommandModelControl();

		/* 建立灯及音响 */
		Light bedroomLight = new Light("beadroomLight");
		Light kitroomLight = new Light("kitroomLight");
		YingXiang yinxiang = new YingXiang();

		/* 具体命令实例 */
		LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
		LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);

		LightOnCommand kitroomLightOn = new LightOnCommand(kitroomLight);
		LightOffCommand kitroomLightOff = new LightOffCommand(kitroomLight);

		YingxiangOnCommand yingxiangOnCommand = new YingxiangOnCommand(yinxiang);
		YingxiangOffCommand yingxiangOffCommand = new YingxiangOffCommand(yinxiang);
		YingxiangAddVolCommand yingxiangAddVolCommand = new YingxiangAddVolCommand(yinxiang);
		YingxiangSubVolCommand yingxiangSubVolCommand = new YingxiangSubVolCommand(yinxiang);

		control.setCommand(0, bedroomLightOn, bedroomLightOff);
		control.setCommand(1, kitroomLightOn, kitroomLightOff);
		control.setCommand(2, yingxiangOnCommand, yingxiangOffCommand);
		control.setCommand(3, yingxiangAddVolCommand, yingxiangSubVolCommand);
		/* 测试开始 */
		control.onButton(0);
		control.offButton(0);
		control.offButton(1);
		control.onButton(1);
		control.onButton(2);
		control.offButton(2);
		control.undoButton(2);
		control.onButton(3);
		control.offButton(3);

	}
}
