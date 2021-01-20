package Operation;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("归还书本");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要归还的书名");
        String name=scanner.nextLine();
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
             Book book=bookList.getBooks(i);
             if(book.getName().equals(name)){
                 book.setStatus(false);
                 System.out.println(book);
                 return;
             }
        }
        System.out.println("没有要归还的这本书");
    }
}
