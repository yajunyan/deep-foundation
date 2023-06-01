package com.yloonspring.accservers.service.kaifayuanze.yilaidaozhiyuanze.yilaidaozhi;

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

public class Testyilaidaozhi {

	@Test
	public void Test() {
		Book book = new Book();
		Mother mother = new Mother();
		/* 可以读任何实现了IRead接口的内容 */
		mother.readStory(book);

		Papper papper = new Papper();
		mother.readStory(papper);
	}
}
