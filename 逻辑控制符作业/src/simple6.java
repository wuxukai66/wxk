import java.util.Scanner;
//打印x
public class simple6 {
    public static void main(String[] args){
        System.out.println("请输入操作");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    xtuxing(n);
    }
    public static void xtuxing(int n){
        char [][]arr=new char[20][20];
        int i;
        int j;
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                if(i==j||i+j==n-1){
                    arr[i][j]='*';
                }else{
                    arr[i][j]=' ';
                }
            }
        }
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        }
    }

