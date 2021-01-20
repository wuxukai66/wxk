import Book.BookList;
import User.AdminUser;
import User.NormalUser;
import User.User;

import java.util.Scanner;

public class Main {
    public static User Login(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入你的姓名");
    String name = scanner.nextLine();
    System.out.println("请输入你的身份：1:管理员 0：普通用户");
    int choice = scanner.nextInt();
        if (choice == 1) {
        return new AdminUser(name);
    } else {
        return new NormalUser(name);
    }
}

    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=Login();
        while(true){
            int choice=user.menu();
            user.doOperation(choice,bookList);
        }
    }

}
