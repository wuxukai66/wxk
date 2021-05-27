package pattern;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * author 武旭凯
 * date: 2021/5/27 19:24
 */
public class TextDemo1 {

    //最大循环次数
    private static final int MAXSIZE=100000;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count=new AtomicInteger(0);
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<MAXSIZE;i++){

                    count.getAndIncrement();
                }
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<MAXSIZE;i++){
                    count.getAndDecrement();
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.get());
    }
}
