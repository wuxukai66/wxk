public class simple13 {
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