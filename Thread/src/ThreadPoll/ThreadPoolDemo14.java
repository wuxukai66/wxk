package ThreadPoll;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * author 武旭凯
 * date: 2021/5/23 10:58
 */
public class ThreadPoolDemo14 {
   
  static  ThreadLocal<String> threadLocal=ThreadLocal.withInitial(new Supplier<String>() {
      @Override
      public String get() {
          System.out.println("执行了初始化方法");

          return "java";
      }
  });
    public static void main(String[] args) {
            String result=threadLocal.get();
        System.out.println("结果"+result);
    }
}
