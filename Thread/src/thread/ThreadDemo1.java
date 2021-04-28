package thread;

/**
 * author 武旭凯
 * date: 2021/4/28 10:58
 */

/**
 * 使用线程提供的终止方法interrupt来终止线程
 */
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
                Thread t1=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(!Thread.interrupted()) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                // e.printStackTrace();
                                break;
                            }
                            System.out.println("转账");
                        }
                        System.out.println("终止转账");
                    }
                });
                t1.start();
                Thread.sleep(310);
        System.out.println("有内鬼，终止交易");
        t1.interrupt();


    }
}
