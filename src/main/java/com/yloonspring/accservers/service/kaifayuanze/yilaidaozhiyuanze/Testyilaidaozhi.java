package com.yloonspring.accservers.service.kaifayuanze.yilaidaozhiyuanze;

import org.junit.Test;

import com.yloonspring.accservers.service.kaifayuanze.yilaidaozhiyuanze.yilaidaozhi.Book;
import com.yloonspring.accservers.service.kaifayuanze.yilaidaozhiyuanze.yilaidaozhi.Mother;
import com.yloonspring.accservers.service.kaifayuanze.yilaidaozhiyuanze.yilaidaozhi.Papper;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午4:38:36
 * @ClassName Testyilaidaozhi
 * @类描述-Description: 核心思想：面向抽象接口或抽象类编程，不能面向对象编程 例子说明：未按照依赖倒置原则设计：
 *                   1、建立一个book类，建立一个mother类，mother类中引入book类，实现读book的方法
 *                   按照依赖倒置原则设计：1、建立一个接口名字为read，建立一个类book，实现read接口，建立一个papper类，实现read接口
 *                   建立一个mother类，读方法入参为接口read，不在是具体的类，实现读任何实现read接口的类数据
 * @修改记录:
 * @版本: 1.0
 */
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
