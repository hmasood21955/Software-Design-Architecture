import java.util.List;
public interface LibraryService {
    void addBook(Book book);
    boolean removeBook(String title);
    List<Book> listBooks();
}
