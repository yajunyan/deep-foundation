package com.yloonspring.accservers.threads;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Collection;
import java.util.concurrent.*;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2022/6/15 11:01
 * @ClassName: FutureTaskDemo
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
@Slf4j
public class FutureTaskDemo {
    @Test
    public void testFutureTask() throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new CallableDemo());
        Thread  t1 = new Thread(futureTask,"t1");
        Thread  t2 = new Thread(futureTask,"t2");
        t1.start();
        t2.start();
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService<Integer>((Executor) this);
        log.info("result=" + futureTask.get());
    }
}
