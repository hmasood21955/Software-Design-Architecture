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

    public List<String> getAvailableTimes() {
        List<String> times = new ArrayList<>();
        for (int h = 8; h <= 20; h++) {
            times.add(String.format("%02d:00", h));
        }
        return times;
    }
}