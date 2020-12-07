//求1！+2！+3！+4！+........+n!的和
public class text3 {
    public static void main(String[] args){
jiechenghe(5);
    }
    public static void jiechenghe(int n){
        int sum=0;
        int i=0;
        int ret=1;
        for(i=1;i<=n;i++){
            ret*=i;
            sum+=ret;
        }
        System.out.println(sum);
    }
}
