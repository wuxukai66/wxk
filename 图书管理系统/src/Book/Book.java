package Book;

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean status;
    public Book(String name,String auther,int price,String type){
        this.name=name;
        this.author=author;
        this.price=price;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                /*", status=" + status +*/
                ( (status == true) ? " 借出 " : " 未借出 ")+
                '}';
    }
}
