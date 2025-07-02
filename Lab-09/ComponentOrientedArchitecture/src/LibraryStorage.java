import java.util.ArrayList;
import java.util.List;

public class LibraryStorage implements Storage {
    private final List<Book> books = new ArrayList<>();
    @Override
    public void save(Book book) {
        books.add(book);
    }
    @Override
    public boolean remove(String title) {
        return books.removeIf(book -> book.getDetails().startsWith(title + " by "));
    }
    @Override
    public List<Book> getAll() {
        return books;
    }
}
