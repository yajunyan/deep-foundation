package com.yloonspring.accservers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yloonspring.accservers.mapper.CurcodeMyBatisMapper;
import com.yloonspring.accservers.po.Curcode;
import com.yloonspring.accservers.service.CurcodeMyBatisService;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月2日 下午10:16:43
 * @ClassName CurcodeMysqlServiceImpl
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
@Service
public class CurcodeMyBatisServiceImpl implements CurcodeMyBatisService {

	@Autowired
	CurcodeMyBatisMapper curcodeMyBatisMapper;

	@Override
	public List<Curcode> selectCurcode(Curcode curcode) {

		return curcodeMyBatisMapper.selectCurcode(curcode);
	}

	@Override
	public int insertCurcode(Curcode curcode) {
		// TODO Auto-generated method stub
		return curcodeMyBatisMapper.insertCurcode(curcode);
	}

}
