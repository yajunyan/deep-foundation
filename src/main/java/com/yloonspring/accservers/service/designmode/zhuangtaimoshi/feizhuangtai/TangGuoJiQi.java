package com.yloonspring.accservers.service.designmode.zhuangtaimoshi.feizhuangtai;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年10月29日 下午8:02:39
 * @ClassName TangGuoJiQi
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class TangGuoJiQi {
	/* 售罄状态 */
	final static int SOLD_OUT = 0;

	/* 未投币状态 */
	final static int NO_QUARTER = 1;

	/* 已投币状态 */
	final static int HAS_QUARTER = 2;

	/* 出糖状态 */
	final static int SOLD = 3;

	/* 默认为售罄状态 */
	int state = SOLD_OUT;

	/* 机器中的糖果数量 */
	int count = 0;

	public TangGuoJiQi(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER; // 改为未投币状态, 说明有糖果存在
		}
	}

	/* 动作实现成方法 */
	public void insertMoney() {
		if (state == HAS_QUARTER) {
			System.out.println("有投入的钱在用，不能重复投入");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("你投入了钱币");
		} else if (state == SOLD_OUT) {
			System.out.println("糖果出售完毕");
		} else if (state == SOLD) {
			System.out.println("正在出糖，不能重复投钱");
		}
	}

	/* 退钱请求 */
	public void TuiqianQuest() {
		if (state == HAS_QUARTER) {
			state = NO_QUARTER;
			System.out.println("执行退钱");
		} else if (state == NO_QUARTER) {
			System.out.println("无法退钱，里面没钱");
		} else if (state == SOLD) {
			System.out.println("糖果已卖出，无法退");
		} else if (state == SOLD_OUT) {
			System.out.println("已无糖果，无法退");
		}
	}

	/* 取货请求 */
	public void QuhuoQuest() {
		if (state == HAS_QUARTER) {
			System.out.println("执行出糖果。。。");
			state = SOLD;
			chutangfunction();
		} else if (state == NO_QUARTER) {
			System.out.println("无法执行出糖果，没给钱");
		} else if (state == SOLD) {
			System.out.println("正在出糖，不能重复点击");
		} else if (state == SOLD_OUT) {
			System.out.println("已无糖果，无法出糖");
		}
	}

	/* 出糖操作 */
	private void chutangfunction() {
		if (state == SOLD) {
			System.out.println("机器正在执行出糖操作");
			count = count - 1;
			if (count == 0) {
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else {
			System.out.println("状态不对");
		}
	}

}
