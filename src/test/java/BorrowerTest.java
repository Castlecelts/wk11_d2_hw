import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;


    @Before
    public void before(){
        borrower = new Borrower("James", 2);
        book1 = new Book("Long Walk to Freedom", "Nelson Mandela", "Biography");
        book2 = new Book("Lord of the Rings", "Tolkien", "Fiction");
        book3 = new Book("Where you going", "That guy", "Non-Fiction");
        book4 = new Book("Artemis Fowl", "I forget", "Fiction");
        book5 = new Book("Across the Nightengale Floor", "Whoops idiot", "Fiction");
        book6 = new Book("Famous 5", "old dude", "Fiction");
        library = new Library("Watsonian", 5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
    }

    @Test
    public void hasAName(){
        assertEquals("James", borrower.getName());
    }

    @Test
    public void hasABorrowLimit(){
        assertEquals(2, borrower.getBookLimit());
    }

    @Test
    public void hasNoBooksToBegin(){
        assertEquals(0, borrower.getBorrowedBookCount());
    }

    @Test
    public void canBorrowABookFromALibrary(){
        borrower.borrowABook(library);
        borrower.borrowABook(library);
        assertEquals(2, borrower.getBorrowedBookCount());
        assertEquals(3, library.getStockCount());
    }

    @Test
    public void canBorrowABookById(){
        borrower.borrowABookById(library, book2);
        assertEquals(1, borrower.getBorrowedBookCount());
        assertEquals(4, library.getStockCount());
//        assertEquals("Lord of the Rings", ????));
    }
}
