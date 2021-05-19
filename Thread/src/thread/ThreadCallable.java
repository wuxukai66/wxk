package thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * author 武旭凯
 * date: 2021/4/25 19:56
 */
public class ThreadCallable {
    static class MyCallable implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            int num=new Random().nextInt(10);

            System.out.println("子线程："+Thread.currentThread().getName()+",随机数"+num);
            return num;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个Callable
        MyCallable myCallable=new MyCallable();
        FutureTask<Integer> futureTesk=new FutureTask<>(myCallable) ;
        Thread thread=new Thread(futureTesk);
        thread.start();
        int result=futureTesk.get();
        System.out.println(Thread.currentThread().getName()+" "+result);

    }
}
