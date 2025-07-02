import java.util.List;
public class LibraryComponent implements LibraryService {
    private final LibraryStorage storage;
    public LibraryComponent(LibraryStorage storage) {
        this.storage = storage;
    }
    @Override
    public void addBook(Book book) {
        storage.save(book);
    }
    @Override
    public List<Book> listBooks() {
        return storage.getAll();
    }
}
