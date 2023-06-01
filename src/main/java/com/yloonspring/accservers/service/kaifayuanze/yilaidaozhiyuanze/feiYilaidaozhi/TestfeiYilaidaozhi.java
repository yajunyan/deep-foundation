package com.yloonspring.accservers.service.kaifayuanze.yilaidaozhiyuanze.feiYilaidaozhi;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午4:06:29
 * @ClassName TestfeiYilaidaozhi
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

public class TestfeiYilaidaozhi {

	@Test
	public void Test() {
		Book book = new Book();
		Mother mother = new Mother();
		/* 只能读向下依赖的类 */
		mother.readStory(book);
	}
}
