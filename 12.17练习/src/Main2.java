//依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
//        输入描述:
//        学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
import java.io.*;
public class Main2 {
    public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String[] split=br.readLine().split("[;,]");
       String a=String.format("%.2f",Double.parseDouble(split[1]));
        String b=String.format("%.2f",Double.parseDouble(split[2]));
        String c=String.format("%.2f",Double.parseDouble(split[3]));
        System.out.println("The each subject score of No. "+split[0]+" is "+a+","+b+","+c+".");
    }
}
