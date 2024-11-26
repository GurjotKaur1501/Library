import static org.junit.jupiter.api.Assertions.*;
import Books.Book;
import Books.BookCatalog;
import Exception.BookNotFoundException;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

    private final BookCatalog bc;
    private final Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1,"Learning Java","","","",0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
    Book book2 = new Book(2,"Learning Java","","","",0);
    assertTrue(bc.addBook(book2));
    assertEquals(2, bc.getNumberOfBooks());
    }

    //G
    @Test
    public void testFindBook() throws BookNotFoundException {
    Book foundBook = bc.findBook("Learning Java");
    assertNotNull(foundBook);
    assertEquals(book1.getID(), foundBook.getID());
    }

    //G
    @Test
    public void testFindBookIgnoringCase() throws BookNotFoundException {
    Book foundBook = bc.findBook("Learning Java");
    assertNotNull(foundBook);
    assertEquals(book1.getID(), foundBook.getID());
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        Book foundBook = bc.findBook("   Learning Java   ");
        assertNotNull(foundBook);
        assertEquals(book1.getID(), foundBook.getID());
    }

}
