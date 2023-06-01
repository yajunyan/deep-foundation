package com.yloonspring.accservers.threads;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2022/6/15 10:51
 * @ClassName: CallableDemo
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
@Slf4j
public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        log.info(Thread.currentThread().getName() + " testcallable");
        Thread.sleep(2000);
        return 48;
    }
}
