public class simple13 {
//    求整数在存储中二进制的个数
    public static void main(String[] args) {
geshu(6);
    }
    public static void geshu(int n ) {
        int count = 0;
       while(n!=0){
        count++;
        n=(n&(n-1));
        }
        System.out.println(count);
    }
}