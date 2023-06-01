package com.yloonspring.accservers.service.designmode.minglingmoshi.minglingfangshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月28日 下午7:39:49
 * @ClassName Control
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public interface Control {
	public void onButton(int slot);

	public void offButton(int slot);

	public void undoButton(int slot);
}
