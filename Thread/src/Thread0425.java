import javax.xml.crypto.Data;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/4/25 19:07
 */
public class Thread0425 {
    //执行的循环次数
    private static  final Long count=5_0000_0000L;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始时间"+new Date());
        //休眠一秒
        //Thread.sleep(1000);
        //休眠的方式2
        //TimeUnit.SECONDS.sleep(1);//休眠一秒
        //休眠实现方式3
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("结束时间"+new Date());

        //concorrency();
        //serial();
    }
//    public static void concorrency() throws InterruptedException {
//        //开始时间
//        Long stime=System.currentTimeMillis();
//
//        Thread t1=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //具体业务
//                int a=0;
//                for (int i = 0; i < count; i++) {
//                    a++;
//                }
//            }
//        });
//        //开始执行线程
//        t1.start();
//        Thread t2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int b=0;
//                for (int i = 0; i < count; i++) {
//                    b++;
//                }
//            }
//        }) ;
//        t2.start();
//        int c=0;
//        for (int i = 0; i < count; i++) {
//            c++;
//        }
//            //等待线程t1,t2执行完成之际，才统计时间
//        t1.join();
//        t2.join();
//        //结束时间
//        Long etime=System.currentTimeMillis();
//        System.out.println("多线程执行了："+(etime-stime));
//    }
//
//    public static void serial() {
//        Long stime=System.currentTimeMillis();
//        int a=0;
//        for (int i = 0; i < 3*count; i++) {
//            a++;
//        }
//        Long etime=System.currentTimeMillis();
//        System.out.println("单线程执行了："+(etime-stime));
//    }
}
