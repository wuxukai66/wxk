package ThreadPoll;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * author 武旭凯
 * date: 2021/5/23 15:37
 */
public class ThreadPoolDemo15 {
    static ThreadLocal<SimpleDateFormat> threadLocal=ThreadLocal.withInitial(new Supplier<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat get() {
            System.out.println("--执行初始化方法--");
            return new SimpleDateFormat("mm:ss");
        }
    });

    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000));
        for (int i = 0; i < 1001; i++) {
            int finali=i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Date date = new Date(finali * 1000);
                    myFormat(date);
                }


            });
        }
    }
    private static  void myFormat(Date date) {
            String result=threadLocal.get().format(date);
        System.out.println("时间"+result);

    }
}

