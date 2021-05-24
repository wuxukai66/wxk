package ThreadPoll;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author 武旭凯
 * date: 2021/5/19 21:05
 */
public class ThreadPoolDemo8 {
    public static void main(String[] args) {
        //创建单个线程的线程池
       ExecutorService service= Executors.newSingleThreadExecutor();
       //执行任务
        for (int i = 0; i <10; i++) {


       service.execute(new Runnable() {
           @Override
           public void run() {
               System.out.println("线程名"+Thread.currentThread().getName());
           }
       });
    }
    }
}
