/**
 * author 武旭凯
 * date: 2021/4/22 21:22
 */
public class Thread0422 {
    public static void main(String[] args) {
        //创建线程
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                //业务代码
                try {
                    //让程序等待一段时间
                    Thread.sleep(60*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //启动线程
        thread.start();
    }

}
