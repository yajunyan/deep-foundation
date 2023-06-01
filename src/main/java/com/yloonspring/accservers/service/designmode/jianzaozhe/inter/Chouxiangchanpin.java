package com.yloonspring.accservers.service.designmode.jianzaozhe.inter;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月16日 下午8:48:27
 * @ClassName Tiaomujiekou
 * @类描述-Description: 建造者模式的核心在于一个复杂的对象由多个其他的对象组成
 *                   主要解决的问题是，这个复杂的对象组成比较稳定，但组成其自身的其他小对象可能是变动比较大的
 *                   比如：我去点饭店的套餐，套餐自身是由套餐名、不同的菜以及套餐价格组成的，但是：各种不同的菜是可以 具体变动的。
 *                   我们要这么去实现建造者模式： 1、做一个套餐的类，这个类包含套餐名字，套餐价格和一个列表，类型是不同的菜。
 *                   2、做一个菜的接口，这个接口包含菜的名字，盛放菜的包装是什么，菜的价格
 *                   3、盛放菜的包装做成一个接口，实现此接口的具体类表示用什么包装装配
 *                   4、实现这菜的接口类，可以做成各种菜(比如宫保鸡丁、汤、红烧肉等等）
 *                   5、实现这个套餐类，包含：设置这个套餐的名称、将不同的菜增加到套餐的list列表中、价格可通过计算每个list表里的菜价格获取到
 * @修改记录:
 * @版本: 1.0
 */
public interface Chouxiangchanpin {
	public String name(); // 什么套餐名称

	public Packing packing(); // 套餐的包装工具，此处是重新建立类去实现，这种就是建造者模式的重点

	public float price(); // 套餐的价格是什么
}
