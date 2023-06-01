package com.yloonspring.accservers.service.designmode.minglingmoshi.minglingfangshi;

import java.util.Stack;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午7:39:13
 * @ClassName CommandModelControl
 * @类描述-Description: 具体遥控器类
 * @修改记录:
 * @版本: 1.0
 */
public class CommandModelControl implements Control {

	/* 具备的命令集合 */
	private Command[] onCommands;
	private Command[] offCommands;

	private Stack<Command> stack = new Stack<Command>();

	public CommandModelControl() {
		/* 将命令实例初始化 */
		onCommands = new Command[5];
		offCommands = new Command[5];
		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 5; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}

	}

	/* 增加可执行的命令 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;

	}

	@Override
	public void onButton(int slot) {
		onCommands[slot].execute();
		stack.add(onCommands[slot]);
	}

	@Override
	public void offButton(int slot) {
		offCommands[slot].execute();
		stack.add(offCommands[slot]);
	}

	@Override
	public void undoButton(int slot) {
		stack.pop().undo();

	}

}
