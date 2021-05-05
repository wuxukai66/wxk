package thread;

/**
 * author 武旭凯
 * date: 2021/5/5 16:01
 */
public class text2 {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            char ch='A';
            @Override
            public void run() {

                System.out.print(ch);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

        Thread thread2=new Thread(new Runnable() {
            char ch2='B';
            @Override
            public void run() {

                    System.out.print(ch2);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


            }
        });

        Thread thread3=new Thread(new Runnable() {
            char ch3='C';
            @Override
            public void run() {

                    System.out.print(ch3);
                    System.out.println();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


            }
        });
        for(int i=0;i<10;i++){
            thread1.run();
            thread2.run();
            thread3.run();
        }

    }
}
