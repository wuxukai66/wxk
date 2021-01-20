package User;

import Book.BookList;
import Operation.IOperation;

public abstract class User {
    public String name;
    public IOperation[] operations;
    public User(String name){
        this.name=name;
    }
    public abstract int menu();
    public void doOperation(int choice, BookList bookList){
    this.operations[choice].work(bookList);
    }

}
