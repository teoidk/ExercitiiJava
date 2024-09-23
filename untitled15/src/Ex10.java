import java.util.Iterator;
import java.util.List;

public class Ex10 {

    //Using the Book class from Exercise 1, create a method that takes a List<Book> and a String author
    // as parameters. The method should remove all books from the list that were written by the specified
    // author.

    // Method to remove all books by a specific author from a list
    public static void removeBooksByAuthor(List<Book> books, String author) {
        // Using an iterator to safely remove items from the list while iterating
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equals(author)) {
                iterator.remove(); // Remove the book if the author matches
            }
        }
    }

    // TODO: stream uri

    public static void main(String[] args) {
        // Example usage
        List<Book> bookList = List.of(
                new Book("Book 1", "Author A", 10.99),
                new Book("Book 2", "Author B", 15.99),
                new Book("Book 3", "Author A", 20.99)
        );

        System.out.println("Before removal:");
        bookList.forEach(Book::displayDetails);

        // Remove books by "Author A"
        removeBooksByAuthor(bookList, "Author A");

        System.out.println("\nAfter removal:");
        bookList.forEach(Book::displayDetails);
    }
}
