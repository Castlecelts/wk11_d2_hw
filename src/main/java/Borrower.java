import java.util.ArrayList;

public class Borrower {
    private String name;
    private Integer borrowLimit;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String borrowerName, Integer borrowerBookLimit){
        this.name = borrowerName;
        this.borrowLimit = borrowerBookLimit;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getBookLimit() {
        return this.borrowLimit;
    }

    public int getBorrowedBookCount() {
        return this.borrowedBooks.size();
    }

    public void borrowABook(Library library) {
        this.borrowedBooks.add(library.lendBook());
    }

    public void borrowABookById(Library library, Book bookId) {
        this.borrowedBooks.add(library.lendBookById(bookId));
    }
}
