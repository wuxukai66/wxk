import java.util.Scanner;
//模拟登陆
public class simple15 {
    public static void main(String[] args) {
        System.out.println("请输入6位密码");
        game();
    }
    public static void game() {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String mima="123456";
        while(true){
            String x = sc.nextLine();
            if(x.equals(mima)){
                System.out.println("输入正确");
                break;
            }else {
                System.out.println("输入有误");
                count++;
            }if(count==4){
                System.out.println("程序退出");
                break;
            }
            }sc.close();
        }
        }

