package pattern;

/**
 * author 武旭凯
 * date: 2021/5/30 9:44
 */

import java.util.concurrent.CountDownLatch;

/**
 * 计数器
 */
public class TextDemo8 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(5);

        for (int i = 1; i <6 ; i++) {
            final int finali=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"开始起跑");

                    try {
                        Thread.sleep(finali*1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"到达终点");
                        //将计数器减一
                    latch.countDown();
                }
            }).start();

        }
        //阻塞等待
        latch.await();
        System.out.println("所有人都到达终点了，公布排名");

    }
}
