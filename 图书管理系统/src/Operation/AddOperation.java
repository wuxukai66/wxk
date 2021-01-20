package Operation;
import Book.Book;
import Book.BookList;
import java.util.Scanner;
public class AddOperation implements IOperation {
    public void work(BookList bookList){
        System.out.println("增加图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name=scanner.nextLine();
        System.out.println("请输入作者");
        String author=scanner.nextLine();
        System.out.println("请输入价格");
        int price=scanner.nextInt();
        System.out.println("请输入类型");
        String type=scanner.nextLine();
         Book book=new Book(name,author,price,type);
        int currentSize =  bookList.getUsedSize();
        bookList.setBooks(currentSize,book);
        bookList.setUsedSize(currentSize+1);
    }


}
