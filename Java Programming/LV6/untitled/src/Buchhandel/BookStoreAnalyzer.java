package Buchhandel;

import java.util.ArrayList;
import java.util.HashMap;

public class BookStoreAnalyzer {
    private ArrayList<Book>books = new ArrayList<>();

    public BookStoreAnalyzer() {
    }

    public void addBook (Book b) {
        if (!books.contains(b)) {
            books.add(b);
        }
    }

    public HashMap<String, Integer> getCountBooksInCategory() {
        HashMap<String, Integer> categoryCount = new HashMap<>();
        for (Book b : books) {
            categoryCount.put(b.category, categoryCount.getOrDefault(b.category, 0) + 1);
        }
        return categoryCount;
    }
}
