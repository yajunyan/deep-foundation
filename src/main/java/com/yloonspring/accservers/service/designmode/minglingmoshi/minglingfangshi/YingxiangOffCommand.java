package com.yloonspring.accservers.service.designmode.minglingmoshi.minglingfangshi;

import com.yloonspring.accservers.service.designmode.minglingmoshi.feimingling.YingXiang;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午7:27:51
 * @ClassName YingxiangOnCommand
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class YingxiangOffCommand implements Command {

	private YingXiang yingxiang;

	public YingxiangOffCommand(YingXiang yingxiang) {
		this.yingxiang = yingxiang;
	}

	@Override
	public void execute() {
		yingxiang.volOff();

	}

	@Override
	public void undo() {
		yingxiang.volOn();
		yingxiang.setCD();

	}

}
