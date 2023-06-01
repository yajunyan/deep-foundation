package com.yloonspring.accservers.service.kaifayuanze.dimitefaze;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午5:53:52
 * @ClassName TestFeiDimitefaze
 * @类描述-Description:  
 *                      定义：一个对象应该对其他对象保持最少的了解。
 *						问题由来：类与类之间的关系越密切，耦合度越大，当一个类发生改变时，对另一个类的影响也越大。
 *						解决方案：尽量降低类与类之间的耦合
 *						例子说明：迪米特思想说明的是一个类不用去间接去使用本应该另一个类应该做的事情
 *                              非迪米特思想中，总公司要打印所有员工的id，在方法中自己实现了打印子公司员工的过程
 *                              迪米特思想中，总公司打印所有员工的id，是分别调用了总公司打印员工的方法和调用子公司打印员工的方法。
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

import com.yloonspring.accservers.service.kaifayuanze.dimitefaze.feiDimitefaze.FenGongsi;
import com.yloonspring.accservers.service.kaifayuanze.dimitefaze.feiDimitefaze.ZongGongsi;

public class TestDimitefaze {
	@Test
	public void Test() {
		ZongGongsi zongGongsi = new ZongGongsi();
		FenGongsi fenGongsi = new FenGongsi();

		zongGongsi.printAllYuangong(fenGongsi);

	}
}
