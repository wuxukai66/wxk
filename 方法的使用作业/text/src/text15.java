//递归求 N 的阶乘
public class text15 {
    public static void main(String[] args) {
        System.out.println(ret(6));
    }
    public static int ret(int n){
        if(n==1){
            return 1;
        }
        return n*ret(n-1);
    }
}
