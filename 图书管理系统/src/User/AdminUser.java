package User;
import Operation.*;

import java.util.Scanner;
public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
        this.operations=new IOperation[]{
                new ExitOperation(),
                new AddOperation(),
                new DeleteOperation(),
                new FindOperation(),
               new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("========================");
        System.out.println("Hello"+name+"欢迎来到图书管理系统");
        System.out.println("1.增加图书");
        System.out.println("2.删除图书");
        System.out.println("3.查找图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("===============");
        int choice=scanner.nextInt();
        return choice;
    }
}
