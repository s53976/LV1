package Buchhandel;

public class PrintedBook extends Book{
    private int countPages;


    public PrintedBook(String title, double price, String author, String category, int countPages) {
        super(title, price, author, category);
        this.countPages = countPages;
    }

    @Override
    public void printPresentationPage() {
        System.out.println("Title " +title);
        System.out.println("author = " + author);
        System.out.println("category = " + category);
        System.out.println("ratings = " + ratings);
        System.out.println("price = " + price);
        System.out.println("bookID = " + bookID);
        System.out.println("countPages = " + countPages);
    }
}
