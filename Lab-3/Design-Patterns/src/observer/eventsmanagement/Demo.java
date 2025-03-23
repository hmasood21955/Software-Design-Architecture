package observer.eventsmanagement;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating a new file editor...");
        Editor editor = new Editor();
        
        System.out.println("Setting up notifications...");
        editor.events.subscribe("open", new LogOpenListener("file_log.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("user@example.com"));
        editor.events.subscribe("save", new SMSSupportListener("+1234567890"));

        try {
            System.out.println("\n--- Testing file open ---");
            editor.openFile("test_document.txt");
            
            System.out.println("\n--- Testing file save ---");
            editor.saveFile();
            
        } catch (Exception e) {
            System.out.println("Oops! Something went wrong: " + e.getMessage());
        }
    }
}