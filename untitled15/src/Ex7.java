import java.util.ArrayList;
import java.util.List;

public class Ex7 {

    //Using the Book class from Exercise 6, create a method that takes a List<Book> and a double
    // maxPrice as parameters. The method should return a new list containing only the books with a price
    // less than maxPrice.

    public static List<Book> getBooks (List<Book> books, double maxPrice) {
        List<Book> newBooks = new ArrayList<>();

        for(Book book : books) {
            if(book.getPrice() < maxPrice){
                newBooks.add(book);
            }
        }
        return newBooks;

    }

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Dune", "Frank H", 32));
        bookList.add(new Book("War and Peace", "Leo T", 12.50));
        bookList.add(new Book("Pride and Prejudice", "Jane A", 29));

        double maxPrice = 30;
        List<Book> newBooks = getBooks(bookList, maxPrice);

        for(Book book : newBooks) {
            book.displayDetails();
        }
    }
}
