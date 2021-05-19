package ThreadPoll;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/5/19 20:46
 */
public class ThreadPollDemo6 {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(10);
        //执行任务
        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务"+new Date());
            }
        },1,3, TimeUnit.SECONDS);

    }
}
