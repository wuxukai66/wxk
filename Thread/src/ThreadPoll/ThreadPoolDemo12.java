package ThreadPoll;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/5/23 9:48
 */
public class ThreadPoolDemo12 {
    private static int count=0;
    public static void main(String[] args) {
        ThreadFactory threadFactory=new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t=new Thread(r);
                t.setName("myThreadPool"+count++);
                return t;
            }
        };
        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,5,0,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000),threadFactory);

        for (int i = 0; i <10 ; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名:"+Thread.currentThread().getName());
                }
            });
        }
    }
}
