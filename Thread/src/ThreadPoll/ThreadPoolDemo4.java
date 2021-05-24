package ThreadPoll;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/5/19 20:12
 */
public class ThreadPoolDemo4 {


    public static void main(String[] args) {
        //创建可以执行定时任务的线程池
        ScheduledExecutorService service=Executors.newScheduledThreadPool(10);
        //执行任务
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务"+new Date());
            }
        },1,3, TimeUnit.SECONDS);
        //参数一：线程池的任务；线程二：定时任务延迟多长时间开始执行；参数三：定时任务的执行频率；参数四：参数二和三的执行单位
    }
}