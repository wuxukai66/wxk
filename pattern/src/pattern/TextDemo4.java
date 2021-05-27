package pattern;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * author 武旭凯
 * date: 2021/5/27 20:01
 */
public class TextDemo4 {
    private static AtomicStampedReference money=new AtomicStampedReference(100,1);
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=   money.compareAndSet(100,0,1,2);
                System.out.println("第一次转账"+result);
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=money.compareAndSet(100,0,1,2);
                System.out.println("第二次转账"+result);
            }
        });

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=money.compareAndSet(0,100,2,3);
                System.out.println("第三次转账"+result);
            }
        });
        t1.join();
        t3.start();
        t3.join();
        t2.start();
    }
}
