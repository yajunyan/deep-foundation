package com.yloonspring.accservers.shejimoshi;

/**
 *
 * @版权 : Copyright (c) 2020-2021 
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 上午11:45:31
 * @ClassName TestYuanxingmoshi
 * @类描述-Description:  TODO
 * @修改记录:
 * @版本: 1.0
 */

import org.junit.Test;

import com.yloonspring.accservers.service.designmode.yuanxingmoshi.YuanxingmoshiService;
import com.yloonspring.accservers.service.designmode.yuanxingmoshi.inter.Shape;

import java.math.BigDecimal;

public class TestYuanxingmoshi {
	@Test
	public void testYuanxingmoshi() {
		YuanxingmoshiService.loadCache();
		Shape clonedShape2 = YuanxingmoshiService.getShape("2");
		Shape clonedShape4 = YuanxingmoshiService.getShape("2");

		if (clonedShape2 == clonedShape4) {
			System.out.println("true" + ": clonedShape2:" + clonedShape2.hashCode());
			System.out.println("true" + ": clonedShape4:" + clonedShape4.hashCode());
		} else {
			System.out.println("false" + ": clonedShape2:" + clonedShape2.hashCode());
			System.out.println("false" + ": clonedShape4:" + clonedShape4.hashCode());
		}

//		Shape clonedShape3 = YuanxingmoshiService.getShape("3");
//		System.out.println(
//				"Shape : " + clonedShape2.getClass() + ",  " + clonedShape2.getType() + " id: " + clonedShape2.getId());
//		System.out.println(
//				"Shape : " + clonedShape3.getClass() + ",  " + clonedShape3.getType() + " id: " + clonedShape3.getId());
	}


	@Test
	public void testBigDecimal(){
		BigDecimal   a = new BigDecimal(56.98);
		BigDecimal  c= new BigDecimal(1.01);
        String  b= "56.98";
        String  d="test";
		System.out.println(a.add(c).compareTo(a));
	}
}
