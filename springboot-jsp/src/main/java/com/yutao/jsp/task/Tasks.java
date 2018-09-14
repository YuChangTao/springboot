package com.yutao.jsp.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * 异步调用
 *
 * @author yutyi
 * @date 2018/09/12
 */
@Component
public class Tasks {
    public static Random random =new Random();

    @Async //该方法会被异步调用
    public void doTaskOne() throws Exception {

        System.out.println("开始做任务一");

        long start =System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");

    }

    @Async
    public void doTaskTwo() throws Exception {

        System.out.println("开始做任务二");

        long start =System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");

    }

    @Async
    public void doTaskThree() throws Exception{

        System.out.println("开始做任务三");

        long start =System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");

    }
}
