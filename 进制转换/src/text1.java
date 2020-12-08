import java.util.Scanner;
//将一个十进制整数转换为其他进制
public class text1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        zhuanhuan(n);
    }
    public static void zhuanhuan(int n){
        Integer.toHexString(n);
        System.out.println(n+"的十六进制为"+Integer.toHexString(n));
        System.out.println(n+"的八进制为"+Integer.toOctalString(n));
        System.out.println(n+"的二进制为"+Integer.toBinaryString(n));
        System.out.println(n+"的三进制为"+Integer.toString(n,3));
    }
}
