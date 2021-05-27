package pattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * author 武旭凯
 * date: 2021/5/27 19:50
 */
//ABA问题
public class TextDemo3 {
    private static AtomicReference money=new AtomicReference(100);
    public static void main(String[] args) throws InterruptedException {
        //转账线程1(-100)
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
             boolean result=   money.compareAndSet(100,0);
                System.out.println("第一次转账"+result);
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=money.compareAndSet(100,0);
                System.out.println("第二次转账"+result);
            }
        });

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result=money.compareAndSet(0,100);
                System.out.println("第三次转账"+result);
            }
        });
        t1.join();
        t3.start();
        t3.join();
        t2.start();
    }
}
