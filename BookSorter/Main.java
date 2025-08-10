import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create book objects
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 15.99));
        books.add(new Book("Clean Code", "Robert C. Martin", 25.50));
        books.add(new Book("1984", "George Orwell", 12.75));

        // Before sorting
        System.out.println("Before Sorting:");
        books.forEach(System.out::println);

        // Sorting by natural order (price) via Comparable
        Collections.sort(books);

        // After sorting
        System.out.println("\nAfter Sorting by Price:");
        books.forEach(System.out::println);
    }
}
