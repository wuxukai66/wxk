package pattern;

/**
 * author 武旭凯
 * date: 2021/5/25 20:20
 */


public class patternDemo1 {
    //单例模式
   static class Singleton{
        //1.先创建一个私有的构造函数，防止其它类直接创建
        private  Singleton(){

        }
        //2.定义私有变量(线程安全)
        private  static Singleton singleton=new Singleton();

        //3.提供公共的获取实例的方法
        public static Singleton getInstance(){
            return singleton;
        }
    }


    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton);
    }
}
