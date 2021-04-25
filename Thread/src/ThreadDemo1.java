/**
 * author 武旭凯
 * date: 2021/4/25 19:35
 */
public class ThreadDemo1 {
   static class MyThread extends Thread{
       @Override
       public void run() {

           System.out.println("线程名称:"+Thread.currentThread().getName());
       }
   }
    public static void main(String[] args) {
        Thread t1=new MyThread();
        t1.start();
        System.out.println("主线程名称:"+Thread.currentThread().getName());
    }

}
