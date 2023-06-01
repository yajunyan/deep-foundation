package com.yloonspring.accservers.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yloonspring.accservers.po.Curcode;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月2日 下午10:15:26
 * @ClassName CurcodeMysqlService
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
@Repository
public interface CurcodeMyBatisMapper {

	 List<Curcode> selectCurcode(Curcode curcode);

	 int insertCurcode(Curcode curcode);
}
