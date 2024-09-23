import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    //Create a class Book with the following attributes:
    //
    //String title
    //String author
    //double price
    //Then, create an ArrayList<Book> and add several Book objects to the list. Write a method to print out
    // the details of each book in the list.

    public static void printDetails(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            book.displayDetails();
        }
    }

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Dune", "Frank H", 32));
        bookList.add(new Book("War and Peace", "Leo T", 12.50));
        bookList.add(new Book("Pride and Prejudice", "Jane A", 29));

        printDetails(bookList);
    }
}
