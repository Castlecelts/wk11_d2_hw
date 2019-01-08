import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Long Walk to Freedom", "Nelson Mandela", "Biography");
    }

    @Test
    public void hasATitle(){
        assertEquals("Long Walk to Freedom", book.getTitle());
    }

    @Test
    public void hasAnAuthor(){
        assertEquals("Nelson Mandela", book.getAuthor());
    }

    @Test
    public void hasAGenre(){
        assertEquals("Biography", book.getGenre());
    }
}
