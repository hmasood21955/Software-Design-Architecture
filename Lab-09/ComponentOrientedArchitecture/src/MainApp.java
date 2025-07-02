import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Storage storage = new LibraryStorage();
        Logger logger = new ConsoleLogger();
        LibraryService library = new LibraryComponent(storage, logger);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option: 1) Add Book 2) Delete Book 3) List Books 4) Exit");
            String option = scanner.nextLine();
            if (option.equals("1")) {
                System.out.println("Enter title:");
                String title = scanner.nextLine();
                System.out.println("Enter author:");
                String author = scanner.nextLine();
                library.addBook(new Book(title, author));
            } else if (option.equals("2")) {
                System.out.println("Enter title to delete:");
                String title = scanner.nextLine();
                boolean removed = library.removeBook(title);
                if (!removed) {
                    System.out.println("Book not found.");
                }
            } else if (option.equals("3")) {
                System.out.println("Books in Library:");
                for (Book book : library.listBooks()) {
                    System.out.println(book.getDetails());
                }
            } else if (option.equals("4")) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
