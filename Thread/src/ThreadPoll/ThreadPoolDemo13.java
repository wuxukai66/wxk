package ThreadPoll;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/5/23 10:07
 */
public class ThreadPoolDemo13 {
    public static void main(String[] args) {

        ThreadPoolExecutor executor=new ThreadPoolExecutor(5, 5, 0,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(5), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("执行了自定义拒绝策略");
            }
        });

        for (int i = 0; i <11 ; i++) {
            final int n=i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("任务"+n+"线程名"+Thread.currentThread().getName());
                }
            });
        }

    }
}
