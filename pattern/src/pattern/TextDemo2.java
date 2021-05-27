package pattern;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * author 武旭凯
 * date: 2021/5/27 19:27
 */
public class TextDemo2 {
    public static void main(String[] args) {
        AtomicInteger count=new AtomicInteger(0);
        count.getAndIncrement();//i++
        count.incrementAndGet();//++i
        System.out.println(count.incrementAndGet());
    }


}
