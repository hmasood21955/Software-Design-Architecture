package code.service;

import code.model.Reminder;
import java.util.ArrayList;
import java.util.List;

public class ReminderService {
    private final List<Reminder> reminders = new ArrayList<>();

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public List<Reminder> getReminders() {
        return new ArrayList<>(reminders);
    }
} 