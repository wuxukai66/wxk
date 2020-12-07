//写一个递归方法，输入一个非负整数，返回组成它的数字之和
public class text12 {
    public static void main(String[] args) {
        System.out.println(qiuhe(1231));
    }
    public static int qiuhe(int n){
        int sum=0;
        if(n<10){
            return n;
        }
        sum=n%10+qiuhe(n/10);
        return sum;
    }
}
