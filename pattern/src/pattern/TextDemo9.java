package pattern;

/**
 * author 武旭凯
 * date: 2021/5/30 10:03
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 循环栅栏
 */
public class TextDemo9 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("执行了CyclicBarrier里面的Runnable");
            }
        });
        for (int i = 1; i <11 ; i++) {
            int finali=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"起跑");

                    try {
                        Thread.sleep(200*finali);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                        //1.计数器减一，2.判断计数器是否为0
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"等待其他人");
                }
            }).start();
        }

            //执行到此，已经冲破了栅栏，有一组线程已经满足条件了

        //System.out.println("所有人都到达终点了，公布排名");
    }
}
