package ThreadPoll;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/5/23 9:23
 */
public class ThreadPoolDemo11 {
    public static void main(String[] args) {
        //原始的创建线程池的方法
        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,10,60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000));
        //参数一：核心线程数，参数二：最大线程数 参数三：最大生命周期 参数四：时间单位 参数五：任务队列
        for (int i = 0; i <10 ; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名"+Thread.currentThread().getName());
                }
            });
        }

    }
}
