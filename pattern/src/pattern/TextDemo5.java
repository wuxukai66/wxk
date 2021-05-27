package pattern;

import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * author 武旭凯
 * date: 2021/5/27 20:45
 */
public class TextDemo5 {
    public static void main(String[] args) {
        //创建一个读写锁
        ReentrantReadWriteLock reentrantReadWriteLock=new ReentrantReadWriteLock();
        //读锁
        ReentrantReadWriteLock.ReadLock readLock=reentrantReadWriteLock.readLock();
        //写锁
        ReentrantReadWriteLock.WriteLock writeLock=reentrantReadWriteLock.writeLock();

        ThreadPoolExecutor executor=new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000));
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    readLock.lock();
                    System.out.println("读锁线程名"+Thread.currentThread().getName()+"时间"+new Date());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        readLock.unlock();
                    }
                }
            });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                readLock.lock();
                System.out.println("读锁线程名"+Thread.currentThread().getName()+"时间"+new Date());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    readLock.unlock();
                }
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
               writeLock.lock();
                System.out.println("写锁线程名"+Thread.currentThread().getName()+"时间"+new Date());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    writeLock.unlock();
                }
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                System.out.println("写锁线程名"+Thread.currentThread().getName()+"时间"+new Date());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    writeLock.unlock();
                }
            }
        });
    }


}
