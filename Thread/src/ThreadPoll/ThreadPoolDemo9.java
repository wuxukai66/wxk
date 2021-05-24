package ThreadPoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author 武旭凯
 * date: 2021/5/19 21:12
 */
public class ThreadPoolDemo9 {
    public static void main(String[] args) {
        //根据当前的工作环境创建线程（异步）
        ExecutorService service=Executors.newWorkStealingPool();
        for (int i = 0; i < 10; i++) {


        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名"+Thread.currentThread().getName());
            }
        });
    }
        while (!service.isTerminated()){

        }
    }
}
