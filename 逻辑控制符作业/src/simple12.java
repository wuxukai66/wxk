import java.util.Random;
import java.util.Scanner;
public class simple12 {
    public static void main(String[] args) {
        System.out.println("请输入你猜的数字1-100");
        game();
    }
    public static void game() {
        Random random = new Random();
    int G = random.nextInt(100);
    Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n < G) {
                System.out.println("猜的数字小了");
            } else if (n > G) {
                System.out.println("猜的数字大了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        } sc.close();
    }
}
