//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
public class test8 {
    public static void main(String[] args){
         int ret=add(10,20);
        System.out.println("ret="+ret);
        double ret2=add(1.5,1.5,1.5);
        System.out.println("ret2="+ret2);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
}
