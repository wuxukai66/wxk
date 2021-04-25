/**
 * author 武旭凯
 * date: 2021/4/25 20:16
 */
public class ThreadRunnable2 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
