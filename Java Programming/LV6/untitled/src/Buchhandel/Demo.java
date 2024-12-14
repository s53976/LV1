package Buchhandel;

public class Demo {
    public static void main(String[] args) {


        PrintedBook printedBook = new PrintedBook("Test", 12, "Test Author", "Krimi");
        DigitalBook digitalBook = new DigitalBook("Test", 14, "Test Author", "Roman");

        Rating rating1 = new Rating(5, "Gutes Buch");
        Rating rating2 = new Rating(5, "Wunderbar");

        printedBook.addRating(rating1);
        digitalBook.addRating(rating2);

        printedBook.printPresentationPage();
        System.out.println("rating = " + rating1);

        BookStoreAnalyzer bookStoreAnalyzer = new BookStoreAnalyzer();
        bookStoreAnalyzer.addBook(printedBook);
    }
}
