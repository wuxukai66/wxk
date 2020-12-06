import java.util.Scanner;
public class simple5 {
    public static void main(String[] args){
        System.out.println("请输入数字");
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    dayin(n);
}
//根据年龄段判断是青少年等
public  static void dayin( int n){

    if(n<=18){
        System.out.println("当前年龄的人为青少年");
    }
    else if(19<=n&&n<29){
        System.out.println("当前年龄的人为青年");
    }
    else if(29<=n&&n<56){
        System.out.println("当前年龄的人为中年");
    }
    else{
        System.out.println("当前年龄的人为老年人");
    }
    }
}