public class simple7 {
    public static void main(String[] args){
//最大公约数
        yueshu(12,5);
    }
    public static void yueshu(int a,int b){
        int c=0;
        while(a%b!=0){
            c=a%b;
            a=b;
            b=c;
        }System.out.printf("最大公约数为%d",b);
    }
}
