import java.util.Scanner;
public class simple8 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        kujuebiao(n);
    }
    public static void kujuebiao(int n){
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.printf("%d*%d=%d ",i,j,i*j);
            }
          System.out.printf("\n");
    }
    }
}

