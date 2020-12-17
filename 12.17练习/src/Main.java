import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
Score(a,b,c);
    }
    public static void Score(int score1,int score2,int score3){
        System.out.print("score1"+"="+score1+",");
        System.out.print("Score2"+"="+score2+",");
        System.out.print("Score3"+"="+score3);
    }
}
