package com.yloonspring.accservers.service.designmode.qiaojie;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月22日 下午2:27:11
 * @ClassName QiaojieService
 * @类描述-Description:  桥接模式是用来进行复杂类分离的
 *                     思想：将实现与抽象类分离
 *                     1、一辆车，根据品牌可以分类 根据使用的变速箱也可以分类
 *                     2、如果按照正常的方式，如果品牌要用不同的类、变速箱也用不同的类
 *                     3、如果有3个品牌的车、2个品牌的变速器则需要实现3*2=6个类
 *                     4、如果将车作为一个抽象类、变速箱作为一个抽象类
 *                     5、将变速箱作为车组成的一个部分，则实现抽象车和抽象变速箱两个类即可
 *                     6、然后变速箱实现通过继承变速箱类则可以单独建立
 *                     7、车的实现通过继承车类则可以实现
 *                     8、桥接就是抽象车类中桥接上变速箱类
 *          
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

import com.yloonspring.accservers.service.designmode.qiaojie.impl.AutoBiansu;
import com.yloonspring.accservers.service.designmode.qiaojie.impl.BenchiCar;
import com.yloonspring.accservers.service.designmode.qiaojie.impl.ShoudongBiansu;
import com.yloonspring.accservers.service.designmode.qiaojie.inter.AbstrctCar;
import com.yloonspring.accservers.service.designmode.qiaojie.inter.BiansuxiangInter;

public class QiaojieService {

	@Test
	public void TestQiaojiemoshi() {
		BiansuxiangInter autoBiansu = new AutoBiansu();
		BiansuxiangInter shoudongbiansuxiang = new ShoudongBiansu();

		/* 桥接到车上 */
		BenchiCar benchiCar = new BenchiCar();
		benchiCar.setBianshuxiang(autoBiansu);
		benchiCar.run();

		AbstrctCar benchiCar1 = new BenchiCar();
		benchiCar1.setBianshuxiang(shoudongbiansuxiang);
		benchiCar1.run();
	}
}
