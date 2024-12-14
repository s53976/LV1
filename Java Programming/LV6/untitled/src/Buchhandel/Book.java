package Buchhandel;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Book {
    private static int nextID = 1;

    protected String title;
    protected double price;
    protected String author;
    protected String category;
    protected ArrayList<Rating> ratings = new ArrayList<>();
    protected int bookID;

    public Book(String title, double price, String author, String category) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.bookID = nextID++;

        switch (category) {
            case "Sachbuch":
            case "Roman":
            case "Krimi":
            case "Kinderbuch":
                this.category = category;
                break;
            default:
                this.category = "Sonstiges";
        }
    }

    public void addRating (Rating r ) {
        ratings.add(r);
    }

    public double calculateRating () {
        double sum = 0;
        double count = 0;

        for (Rating rating : ratings) {
            if (ratings.size() == 0) {
                return -1;
            } else
            sum += rating.getStars();
            count++;
        }

        return (count/sum);
    }

    public abstract void printPresentationPage();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(category, book.category) && Objects.equals(ratings, book.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, author, category, ratings);
    }
}
