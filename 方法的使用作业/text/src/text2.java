//求斐波那契数列的第n项。(迭代实现)
public class text2 {
    public static void main(String[] args){
    fib(2);
}
    public static void fib(int n){
        int f1=1;
        int f2=1;
        int f3=1;
        int i;
        for(i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.println(f3);
    }
}
