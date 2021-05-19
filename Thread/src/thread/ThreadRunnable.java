package thread;

/**
 * author 武旭凯
 * date: 2021/4/25 19:45
 */
public class ThreadRunnable {
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("线程名"+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();
            Thread thread=new Thread(runnable);
            thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
