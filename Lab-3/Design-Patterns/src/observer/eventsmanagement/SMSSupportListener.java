package observer.eventsmanagement;

import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private static final int MAX_SMS_LENGTH = 160;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "File " + file.getName() + " was " + eventType;

        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("WARNING: The SMS message is too long! It can't be more than " + MAX_SMS_LENGTH + " characters.");
        } else {
            System.out.println("SMS sent to " + phoneNumber + ": " + message);
        }
    }
}
