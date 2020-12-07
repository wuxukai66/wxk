//青蛙跳台阶问题
public class text9 {
    public static void main(String[] args){
jump(4);
        System.out.println("共有"+jump(4)+"种跳法");
    }
    public static int jump(int n){
         int f0=1;
        int f1=1;
        int f2=1;
        int i;
        for(i=2;i<=n;i++){
            f2=f1+f0;
            f0=f1;
            f1=f2;
        }
        return f2;
    }
}
