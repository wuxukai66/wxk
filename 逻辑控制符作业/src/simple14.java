import java.util.Scanner;
//分别打印整数存储中奇数位和偶数位
public class simple14 {
    public static void main(String[] args){
        System.out.println("请输入数字");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        erjinzhi(n);
    }
    public static void erjinzhi(int n){
        int i;
        System.out.println("偶数位");
        for(i=31;i>=1;i-=2){
            System.out.printf("%d ",(n>>i)&1);
        }
        System.out.println("\n====================");
        System.out.println("奇数位");
        for(i=30;i>=-1;i-=2){
            System.out.printf("%d ",(n>>i)&1);
        }
    }
}
