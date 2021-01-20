package Operation;
import Book.Book;
import Book.BookList;
import java.util.Scanner;
public class BorrowOperation implements IOperation{
    @Override
        public void work(BookList bookList) {
            System.out.println("借阅书籍");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要借阅的书名");
            String name = scanner.nextLine();
            for (int i = 0; i < bookList.getUsedSize(); i++) {
                Book book = bookList.getBooks(i);
                if(book.getName().equals(name)) {
                    book.setStatus(true);
                    System.out.println(book);
                    return;
                }
            }
            System.out.println("没有你要借阅的图书！");
    }
}
