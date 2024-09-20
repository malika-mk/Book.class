public class Book{
    public String title;
    public String author;
    public int ISBN;
    public int price;

    Book(String title, String author, int ISBN, int price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }


    public void dispayInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book ISBN: " + ISBN);
        System.out.println("Book price: " + price);
    }


}
