//求 N 的阶乘
public class text4 {
    public static void main(String[] args){
        jiecheng(5);
    }
    public static void jiecheng(int n){
        int i=0;
        int ret=1;
        for(i=1;i<=n;i++){
            ret*=i;
        }
        System.out.println(ret);
    }
}
