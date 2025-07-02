import java.util.ArrayList;
import java.util.List;
public class LibraryStorage implements Storage {
    private final List<Book> books = new ArrayList<>();
    public void save(Book book) {
        books.add(book);
    }
    public boolean remove(String title) {
        return books.removeIf(book -> book.getDetails().startsWith(title + " by "));
    }
    public List<Book> getAll() {
        return books;
    }
}
