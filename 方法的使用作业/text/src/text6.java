//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//        ​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
public class text6 {
    public static void main(String[] args){
        Max3(5,10,4);
    }
    public static int Max2(int a,int b){
        int n=0;
        if(a>b){
            n=a;
        }
        else if(a<b){
            n=b;
        }
        return n;
    }
    public static void Max3(int a,int b,int c){

        System.out.println(Max2(Max2(a,b),c));
    }
}