import java.util.Scanner;
public class simple6 {
    public static void main(String[] args){
        System.out.println("请输入操作");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    xtuxing(n);
    }
    public static void xtuxing(int n){
        switch(n){
            case 5:
                System.out.printf("*   *\n * *\n  *\n * *\n*   *\n");
                break;
            case 6:
                System.out.printf("*    *\n *  *\n  **\n  **\n *  *\n*    *\n");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
