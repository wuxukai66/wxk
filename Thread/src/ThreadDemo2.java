/**
 * author 武旭凯
 * date: 2021/4/25 20:13
 */
public class ThreadDemo2 {

    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run(){
                System.out.println("线程名称"+Thread.currentThread().getName());
            }
        };
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
