import java.util.Scanner;
public class simple15 {
    public static void main(String[] args) {
        System.out.println("请输入6位密码");
        game();
    }
    public static void game() {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int n = 123456;
        while(true){
            int x = sc.nextInt();
            if(x!=n){
                System.out.println("输入有误");
                count++;
            }else if(x==n){
                System.out.println("密码正确");
                count++;
            }if(count==4){
                System.out.println("程序退出");
                break;
            }
            }sc.close();
        }
        }

