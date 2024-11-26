package Books;
import Exception.BookNotFoundException;

public class BookCatalog {

    private Book[] bookArray = new Book[100];
    private int nextPosition = 0;

    public Book[] getBookArray() {
        return bookArray;
    }

    public int getNumberOfBooks() {
        return nextPosition;
    }

    public boolean addBook(Book newBook) {
        bookArray[nextPosition] = newBook;
        nextPosition++;
        return false;
    }

    public Book findBook(String title) throws BookNotFoundException
    {
        title = title.trim();

        for (int counter = 0; counter < nextPosition; counter++) {
            if (bookArray[counter].getTitle().equalsIgnoreCase(title)) {
                return bookArray[counter];
            }
        }
        throw new BookNotFoundException();
    }

}
