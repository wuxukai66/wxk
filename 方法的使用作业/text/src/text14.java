//递归求 1 + 2 + 3 + ... + 10
public class text14 {
    public static void main(String[] args) {
        System.out.println(add(5));
    }
    public static int add(int n){
        if(n==1){
            return 1;
        }
        return n+add(n-1);
    }
}
