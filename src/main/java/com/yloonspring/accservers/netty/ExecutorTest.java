package com.yloonspring.accservers.netty;

import io.netty.util.concurrent.EventExecutorGroup;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.ognl.EvaluationPool;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @版权 : Copyright (c) 2020-2021
 * @author: yanyajun
 * @E-mail: yajunyan3@creditease.cn
 * @版本: 1.0
 * @创建日期: 2022/6/7 11:43
 * @ClassName: ExecutorTest
 * @类描述-Description:
 * @修改记录:
 * @版本: 1.0
 */
@Slf4j
public class ExecutorTest {


    @Test
    public void test1() {
        /** 通过runnable接口执行任务 */
        Runnable runnabletask = () -> {
            for (int i = 0; i < 3; i++) {
                log.info(Thread.currentThread().getName() + " test runable" + i);
            }
        };

        Thread thread = new Thread(runnabletask);
        thread.setName("thread0");
        Thread thread1 = new Thread(runnabletask);
        thread.setName("thread1");
        Thread thread2 = new Thread(runnabletask);
        thread.setName("thread2");
        thread.start();
        thread1.start();
        thread2.start();
        log.info("main thread ");
        return;
    }

    class MyCallable<T> implements Callable<T> {

        @Override
        public T call() throws Exception {
            log.info(Thread.currentThread().getName() + " run");
            return null;
        }
    }

    @Test
    public void test12() {
        /** 包装callable到futureTask,启动线程执行任务 */
        Callable<Object> callable = new MyCallable<Object>();
        FutureTask<Object> futureTask = new FutureTask<Object>(callable);
        Thread thread = new Thread((futureTask), "taskA");
        thread.start();
        log.info("main thread" + Thread.currentThread().getName());
    }

    @Test
    public void testThreadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable runnabletask = () -> {
            log.info(Thread.currentThread().getName() + " test runable");
        };
        for (int i = 0; i < 100; i++) {
            executorService.execute(runnabletask);
        }
        log.info(Thread.currentThread().getName());
    }
}
