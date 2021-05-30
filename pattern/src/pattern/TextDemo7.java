package pattern;

/**
 * author 武旭凯
 * date: 2021/5/30 9:22
 */


import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 信号量演示程序
 */
public class TextDemo7 {
    public static void main(String[] args) {
        //创建信号量
        Semaphore semaphore=new Semaphore(2);

        ThreadPoolExecutor executor=new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(4));
        for (int i = 0; i < 4; i++) {


        //创建任务
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"到达停车场");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //试图进入停车
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //当代码执行到这，说明已经获取到锁
                System.out.println(Thread.currentThread().getName()+"进入停车场");
                //车辆停留
                int num=1+new Random().nextInt(5);
                try {
                    Thread.sleep(num*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //离开停车场
                System.out.println(Thread.currentThread().getName()+"离开停车场");

                //释放锁
                semaphore.release();
            }
        });
    }
}
}