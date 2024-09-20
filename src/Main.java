
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Memoirs of a Geisha", "Arthur Golden", 184, 25);
        book.dispayInfo();
        double discountedPrice1 = book.calculateDiscountPrice(10);  // Скидка 10% для первой книги
        System.out.println("Discounted price for 'Memoirs of a Geisha': " + discountedPrice1);


        Book book2 = new Book("The Little Prince", "Antoine Maries Jean-Baptiste", 190, 30);
        book2.dispayInfo();
        double discountedPrice2 = book2.calculateDiscountPrice(50);  // Скидка 50% для второй книги
        System.out.println("Discounted price for 'The Little Prince': " + discountedPrice2);

        Book book3 = new Book("Gossip Girl", "Cecily Brooke von Ziegesar", 345, 45);
        book3.dispayInfo();
        double discountedPrice3 = book3.calculateDiscountPrice(20);  // Скидка 20% для третьей книги
        System.out.println("Discounted price for 'Gossip Girl': " + discountedPrice3);
    }
}
