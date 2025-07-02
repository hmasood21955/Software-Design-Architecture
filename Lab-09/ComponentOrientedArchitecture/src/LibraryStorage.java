import java.util.ArrayList;
import java.util.List;
public class LibraryStorage {
    private final List<Book> books = new ArrayList<>();
    public void save(Book book) {
        books.add(book);
    }
    public List<Book> getAll() {
        return books;
    }
}
