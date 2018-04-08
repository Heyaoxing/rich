package com.rich.shiroTest;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/3/23 14:14
 */
public class ThreadUnit {
    @Test
    public void method() throws InterruptedException, ExecutionException {
        int nThreads = 5;

        /**
         * Executors是ThreadPoolExecutor的工厂构造方法
         */
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);

        //submit有返回值，而execute没有返回值，有返回值方便Exception的处理
        Future res = executor.submit(new ConsumerThread());
        //executor.execute(new ConsumerThread());

        /**
         * shutdown调用后，不可以再submit新的task，已经submit的将继续执行
         * shutdownNow试图停止当前正执行的task，并返回尚未执行的task的list
         */
        executor.shutdown();

        //配合shutdown使用，shutdown之后等待所有的已提交线程运行完，或者到超时。继续执行后续代码
        executor.awaitTermination(1, TimeUnit.DAYS);

        //打印执行结果，出错的话会抛出异常，如果是调用execute执行线程那异常会直接抛出，不好控制，submit提交线程，调用res.get()时才会抛出异常，方便控制异常
        System.out.println("future result:"+res.get());
    }
}

 class ConsumerThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }
    }
}
