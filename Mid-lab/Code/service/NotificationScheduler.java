package code.service;

import code.model.Reminder;

public class NotificationScheduler {
    public void schedule(Reminder reminder) {
        // Simulate scheduling
        System.out.println("Notification scheduled for: " + reminder.getTaskName() + " at " + reminder.getTime());
    }
} 