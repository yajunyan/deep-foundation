package com.yloonspring.accservers.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.yloonspring.accservers.redis.config.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yloonspring.accservers.po.Curcode;
import com.yloonspring.accservers.service.impl.CurcodeMyBatisServiceImpl;

/**
 *
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: jianxinzhizhuo800@163.com
 * @版本: 1.0
 * @创建日期: 2020年9月3日 上午11:19:28
 * @ClassName MainController
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
@RestController
@RequestMapping("/mybatis")
@Slf4j
public class MainController {
	//private static final Logger log = LogManager.getLogger(MainController.class);

	@Autowired
	CurcodeMyBatisServiceImpl curcodeMysqlServiceImpl;

	@Autowired
	RedisUtil redisUtil;
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String selectCurcode(HttpServletRequest request, Curcode curcodetab) {

		Curcode  curcodetest = new Curcode();
		curcodetest.setCurcode("01");
		List<Curcode> curcodelist = curcodeMysqlServiceImpl.selectCurcode(curcodetest);
		for (Curcode curcodes : curcodelist) {
			log.info(curcodes.toString());
		}

		redisUtil.set("testcluster", "success");

		return JSON.toJSONString(redisUtil.get("testcluster"));

	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insertCurcode(HttpServletRequest request, Curcode curcodetab) {

		Curcode curcode = new Curcode();
		curcode.setCurcode("17");
		curcode.setCursym("JAP");
		curcode.setCursecunit(0);
		curcode.setCurchdesc("日元");
		curcode.setSubmitoper("008330");
		curcode.setMemo("JAPTEST");
		curcodeMysqlServiceImpl.insertCurcode(curcode);
		return "mybaitselect";

	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String list(HttpServletRequest request, Curcode curcodetab) {

		return "yloon";
	}


}
