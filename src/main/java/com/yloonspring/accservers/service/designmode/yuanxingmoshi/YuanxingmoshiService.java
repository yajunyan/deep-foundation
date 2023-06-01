package com.yloonspring.accservers.service.designmode.yuanxingmoshi;

import java.util.Hashtable;

import com.yloonspring.accservers.service.designmode.yuanxingmoshi.impl.Changfangxing;
import com.yloonspring.accservers.service.designmode.yuanxingmoshi.impl.Zhengfangxing;
import com.yloonspring.accservers.service.designmode.yuanxingmoshi.inter.Shape;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月19日 上午11:07:30
 * @ClassName YuanxingmoshiService
 * @类描述-Description: 原型模式的核心点在于将实体对象进行克隆，通过对象来建立对象，
 *                   而不是通过类来建立对象，原因在于被克隆的实例对象每次创建需要 花费大的系统资源，比如硬盘资源、io资源或数据库资源
 * @修改记录:
 * @版本: 1.0
 */
public class YuanxingmoshiService {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape shape = shapeMap.get(shapeId);
		/* 克隆对象,核心点,通过克隆来达到通过对象（此对象创建时候非常复杂，可能是根据具体需求动态生成的一个对象）来建立对象，而不是通过类来建立对象 */
		return (Shape) shape.clone();
	}

	public static void loadCache() {

		Zhengfangxing square = new Zhengfangxing();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Changfangxing rectangle = new Changfangxing();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
