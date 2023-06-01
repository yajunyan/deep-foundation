package com.yloonspring.accservers.service.designmode.minglingmoshi.minglingfangshi;

import com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling.Light;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午7:26:28
 * @ClassName LightOffCommand
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class LightOffCommand implements Command {
	public Light light;

	/* 命令具体实现 */
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOff("light");

	}

	@Override
	public void undo() {
		light.lightOn("light");

	}
}
