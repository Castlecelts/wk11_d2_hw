import java.util.ArrayList;

public class Library {
    private String name;
    private Integer capacity;
    private ArrayList<Book> stock;

    public Library(String libraryName, Integer libraryBookCapacity){
        this.name = libraryName;
        this.capacity = libraryBookCapacity;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (getStockCount() == getMaxCapacity()){
            return;
        }
        else {
            this.stock.add(book);
        }
    }

    public int getMaxCapacity() {
        return this.capacity;
    }
}
