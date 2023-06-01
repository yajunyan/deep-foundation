package com.yloonspring.accservers.service.kaifayuanze.dimitefaze.dimitefaze;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午5:53:52
 * @ClassName TestFeiDimitefaze
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

public class TestDimitefaze {
	@Test
	public void Test() {
		ZongGongsi zongGongsi = new ZongGongsi();
		FenGongsi fenGongsi = new FenGongsi();

		zongGongsi.printAllYuangong(fenGongsi);

	}
}
