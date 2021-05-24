package ThreadPoll;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/5/19 20:57
 */
public class ThreadPoolDemo7 {
    public static void main(String[] args) {
        //创建单个执行定时任务的线程池
       ScheduledExecutorService service= Executors.newSingleThreadScheduledExecutor();
       //执行任务
       service.scheduleAtFixedRate(new Runnable() {
           @Override
           public void run() {
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("执行任务"+new Date());
           }
       },1,3, TimeUnit.SECONDS);

    }
}
