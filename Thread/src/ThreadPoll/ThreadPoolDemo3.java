package ThreadPoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author 武旭凯
 * date: 2021/5/19 20:06
 */
public class ThreadPoolDemo3 {
    //创建带有缓存的线程池
    public static void main(String[] args) {
       ExecutorService service= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}
