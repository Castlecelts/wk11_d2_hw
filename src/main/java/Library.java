import java.util.ArrayList;

public class Library {
    private String name;
    private Integer capacity;
    private ArrayList<Book> stock;

    public Library(String libraryName){
        this.name = libraryName;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        this.stock.add(book);
    }
}
