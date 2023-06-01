package com.yloonspring.accservers.service.designmode.minglingmoshi.minglingfangshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午7:19:58
 * @ClassName Commond
 * @类描述-Description: 命令的顶级接口，所有调用命令的调用者都需要通过此接口进行命令调用
 * @修改记录:
 * @版本: 1.0
 */
public interface Command {
	public void execute();

	public void undo();
}
