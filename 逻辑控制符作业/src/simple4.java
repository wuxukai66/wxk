import java.util.Scanner;
public class simple4 {
    public static void main(String[] args) {
        System.out.println("请输入数字");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        isLeapYear(n);
    }
//    判断所输入的年份是否为闰年
    public static void isLeapYear( int n){
        int i=0;
        int flag=0;
        for(i=2;i<=n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }if(flag==0){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
