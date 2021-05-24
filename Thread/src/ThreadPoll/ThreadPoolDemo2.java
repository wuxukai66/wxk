package ThreadPoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * author 武旭凯
 * date: 2021/5/19 19:54
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        MyThreadFactory myThreadFactory=new MyThreadFactory();
        ExecutorService service= Executors.newFixedThreadPool(10,myThreadFactory);
        for (int i = 0; i <10 ; i++) {
                service.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName());
                    }
                });
        }
    }
    private static int count=1;
    static class MyThreadFactory implements ThreadFactory{
        @Override
        public Thread newThread(Runnable r) {
            Thread thread=new Thread(r);
            //设置线程池的命名
            thread.setName("myThreadPoll"+count++);
            //设置线程池的优先级
            thread.setPriority(10);
            return thread;
        }
    }
}
