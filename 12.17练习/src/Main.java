//输入3科成绩，然后把三科成绩输出，成绩为整数形式。
//输入描述:
//一行，3科成绩，用空格分隔，范围（0~100）
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int d=sc.nextInt();
Score(a,b,d);
    }
    public static void Score(int score1,int score2,int score3){
        System.out.print("score1"+"="+score1+",");
        System.out.print("Score2"+"="+score2+",");
        System.out.print("Score3"+"="+score3);
    }
}
