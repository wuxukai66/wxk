import java.util.Scanner;
public class simple10 {
//    水仙花数
    public static void main(String[] args){
        shuixianhua();
    }
    public static void shuixianhua(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int i;
        for(i=1;i<=n;i++){
            int tmp=i;
            while(tmp!=0){
            tmp=tmp/10;
            count++;
            }
             tmp=i;
            int sum=0;
            while(tmp!=0){
               sum+=Math.pow(tmp%10,count);
                       tmp=tmp/10;
            }
            count=0;
            if(sum==i){
                System.out.println(i);
            }
        }

//        int n;
//        int a,b,c;
//        for(n=0;n<1000;n++){
//            a=n/100;
//            b=n/10%10;
//            c=n%10;
//            if(a*a*a+b*b*b+c*c*c==n) {
//                System.out.printf("%d ", n);
//            }
//        }
    }
}
