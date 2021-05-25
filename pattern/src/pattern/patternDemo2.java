package pattern;

/**
 * author 武旭凯
 * date: 2021/5/25 20:29
 */



//懒汉方式
public class patternDemo2 {
    static class Singleton{
        //1.创建一个私有的构造函数，防止其他地方直接实例化
        private  Singleton(){

        }
        //2.创建一个私有的类对象

        private static volatile Singleton singleton=null;

        //3.提供统一的访问入口（方法）
        public static Singleton getInstance(){
            if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    //第一次访问
                    singleton=new Singleton();
                    }
                }
            }
            return singleton;
        }
    }
    private  static Singleton s1=null;
    private  static Singleton s2=null;
    public static void main(String[] args) throws InterruptedException {

        //创建新线程执行任务
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                s1=Singleton.getInstance();
            }
        });
        t1.start();
        s2=Singleton.getInstance();
        t1.join();


        System.out.println(s1==s2);
    }
}
