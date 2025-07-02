import java.util.List;

public interface Storage {
    void save(Book book);
    boolean remove(String title);
    List<Book> getAll();
}
