import static org.junit.jupiter.api.Assertions.*;

import Books.Book;
import org.junit.jupiter.api.Test;

class BookTest {

    //G
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(1984, "George Orwell", "George Orwell", "978-0156262248", "London", 127);
        Book book2 = new Book(1984, "George Orwell","George Orwell", "978-0156262248", "London", 127);
        assertEquals(book1, book2, "Books with the same title and author should be equal.");
    }

    //G
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(1984, "George Orwell","George Orwell", "978-0156262248", "London", 127);
        Book book2 = new Book(1997, "Harry Potter", "J.K Rowling", "9789129723946", "London", 328);
        assertNotEquals(book1, book2, "Books with the same title and author should not be equal.");
    }

}
