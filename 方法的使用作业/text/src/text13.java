//按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
public class text13 {
    public static void main(String[] args) {
        dayin(1234);
    }
    public static void dayin(int n){
        if(n>9){
            dayin(n/10);
        }
        System.out.println(n%10);
    }
}
