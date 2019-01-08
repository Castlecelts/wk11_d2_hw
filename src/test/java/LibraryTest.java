import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void before(){
        book1 = new Book("Long Walk to Freedom", "Nelson Mandela", "Biography");
        book2 = new Book("Lord of the Rings", "Tolkien", "Fiction");
        book3 = new Book("Where you going", "That guy", "Non-Fiction");
        book4 = new Book("Artemis Fowl", "I forget", "Fiction");
        book5 = new Book("Across the Nightengale Floor", "Whoops idiot", "Fiction");
        book6 = new Book("Famous 5", "old dude", "Fiction");
        library = new Library("Watsonian", 5);
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

    @Test
    public void hasABookCapacity(){
        assertEquals(5, library.getMaxCapacity());
    }

    @Test
    public void cantAddABookPastMaxCapacityToStock(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(5, library.getStockCount());
        library.addBook(book6);
        assertEquals(5, library.getStockCount());
    }

    @Test
    public void canLendABook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(5, library.getStockCount());
        library.lendBook();
        assertEquals(4, library.getStockCount());
    }

    @Test
    public void canLendABookById(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(5, library.getStockCount());
        library.lendBookById(book2);
        assertEquals(4, library.getStockCount());
    }
}
