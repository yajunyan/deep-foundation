package com.yloonspring.accservers.service;

import java.util.List;

import com.yloonspring.accservers.po.Curcode;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月3日 上午11:32:20
 * @ClassName CurcodeMyBatisService
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public interface CurcodeMyBatisService {
	public List<Curcode> selectCurcode(Curcode curcode);

	public int insertCurcode(Curcode curcode);
}
