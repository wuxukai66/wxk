package thread;

/**
 * author 武旭凯
 * date: 2021/4/28 10:24
 */
public class Thread0427 {

    /**
     * 使用全局变量来终止线程
     */
    private  static boolean flag=false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(!flag){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("转账中");
                }
                System.out.println("终止转账");
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(310);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("终止转账");
                flag=true;
            }
        });
        t2.start();
        t1.join();
        t2.join();
    }
}
