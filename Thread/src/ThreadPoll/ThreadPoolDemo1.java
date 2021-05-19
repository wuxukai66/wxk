package ThreadPoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author 武旭凯
 * date: 2021/5/19 19:34
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        //创建固定个数的线程池
        ExecutorService service= Executors.newFixedThreadPool(10);

        //执行任务
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名"+Thread.currentThread().getName());
            }
        });
    }
}
