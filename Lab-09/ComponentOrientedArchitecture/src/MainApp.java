import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        LibraryStorage storage = new LibraryStorage();
        LibraryService library = new LibraryComponent(storage);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Add a new book (title, author):");
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            library.addBook(new Book(title, author));
            System.out.println("Books in Library:");
            for (Book book : library.listBooks()) {
                System.out.println(book.getDetails());
            }
        }
    }
}
