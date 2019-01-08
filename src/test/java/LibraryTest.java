import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        book1 = new Book("Long Walk to Freedom", "Nelson Mandela", "Biography");
        book2 = new Book("Lord of the Rings", "Tolkien", "Fiction");
        library = new Library("Watsonian");
    }

    @Test
    public void hasAName(){
        assertEquals("Watsonian", library.getName());
    }

    @Test
    public void hasNoInitialStock(){
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void canAddABookToStock(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getStockCount());
    }
}
