package Buchhandel;

public class DigitalBook extends Book{
    private String fileName;
    private int fileSize;


    public DigitalBook(String title, double price, String author, String category) {
        super(title, price, author, category);
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public void printPresentationPage() {
        System.out.println("Title " +title);
        System.out.println("author = " + author);
        System.out.println("category = " + category);
        System.out.println("ratings = " + ratings);
        System.out.println("price = " + price);
        System.out.println("bookID = " + bookID);
    }


}
