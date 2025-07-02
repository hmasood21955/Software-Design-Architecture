import java.util.List;

public class LibraryComponent implements LibraryService {
    private final Storage storage;
    private final Logger logger;
    public LibraryComponent(Storage storage, Logger logger) {
        this.storage = storage;
        this.logger = logger;
    }
    @Override
    public void addBook(Book book) {
        storage.save(book);
        logger.log("Added book: " + book.getDetails());
    }
    @Override
    public boolean removeBook(String title) {
        boolean removed = storage.remove(title);
        if (removed) {
            logger.log("Removed book with title: " + title);
        } else {
            logger.log("No book found with title: " + title);
        }
        return removed;
    }
    @Override
    public List<Book> listBooks() {
        return storage.getAll();
    }
}
