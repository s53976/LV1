package Buchhandel;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {


        PrintedBook printedBook = new PrintedBook("Test", 12, "Test Author", "Krimi", 200);
        DigitalBook digitalBook = new DigitalBook("Test", 14, "Test Author", "Krimi", "Test",2);

        Rating rating1 = new Rating(5, "Gutes Buch");
        Rating rating2 = new Rating(5, "Wunderbar");

        printedBook.addRating(rating1);
        digitalBook.addRating(rating2);

        printedBook.printPresentationPage();
        System.out.println("rating = " + rating1);

        BookStoreAnalyzer bookStoreAnalyzer = new BookStoreAnalyzer();
        bookStoreAnalyzer.addBook(printedBook);
        bookStoreAnalyzer.addBook(digitalBook);
        HashMap<String, Integer> ergbenis = bookStoreAnalyzer.getCountBooksInCategory();
        for (Map.Entry<String, Integer> stringIntegerEntry : ergbenis.entrySet()) {
            System.out.println("stringIntegerEntry = " + stringIntegerEntry.getValue() + stringIntegerEntry.getKey());
        }

    }
}
