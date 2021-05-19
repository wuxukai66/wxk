package thread;

import java.util.concurrent.TimeUnit;

/**
 * author 武旭凯
 * date: 2021/4/25 20:34
 */
public class Text {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            String str="ABCD";
            @Override
            public void run() {
                for (char x:str.toCharArray()) {
                    System.out.print(x);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        thread1.start();
        Thread thread2=new Thread(new Runnable() {
            String str="ABCD";
            @Override
            public void run() {
                for (char x:str.toCharArray()) {
                    System.out.print(x);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        thread2.start();
    }
}
