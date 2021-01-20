package Operation;

import Book.Book;
import Book.BookList;

public class DisplayOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("展示图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book Book = bookList.getBooks(i);
            System.out.println(Book);
        }
    }
}