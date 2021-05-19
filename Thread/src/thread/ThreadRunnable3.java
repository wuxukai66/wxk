package thread;

/**
 * author 武旭凯
 * date: 2021/4/25 20:18
 */
public class ThreadRunnable3 {
    public static void main(String[] args) {
        Thread thread=new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
