import com.sun.deploy.security.SelectableSecurityManager;

//在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
public class text7 {
    public static void main(String[] args){
        Max(7,6);
        Max(12.5,13.5);
        Max(10,9.5,10.5);
    }

//    public static int Max(int a,int b) {
//        System.out.println(Math.max(a,b));
//        return Math.max(a,b);
//
//    }
    public static int Max(int a,int b){
        int c;
        if(a>b){
            c=a;
        }
       else{
            c=b;
        }System.out.println(c);
       return c;

    }
    public static double Max(double a,double b){
        double c;
        if(a>b){
            c=a;
        }
        else{
            c=b;
        }System.out.println(c);
        return c;
    }
    public static double Max(int a,double b,double c){
        double d;
        double g;
        if(b>c){
           d=b;
        }else{
            d=c;
        }
        if(d<a){
           g=a;
        }else {
            g=d;
        }
        System.out.println(g);
        return g;
    }
}