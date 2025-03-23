package observer.eventsmanagement;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating a new file editor...");
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
    
        System.out.println("Setting up notifications...");
        editor.events.subscribe("open", new LogOpenListener("file_log.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("user@example.com"));
        editor.events.subscribe("save", new SMSSupportListener("+1234567890"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}