package code.controller;

import code.model.Reminder;
import code.service.NotificationScheduler;
import code.service.ReminderService;
import code.service.TaskService;
import java.util.List;

public class ReminderController {
    private final TaskService taskService;
    private final NotificationScheduler scheduler;
    private final ReminderService reminderService;

    public ReminderController(TaskService taskService, NotificationScheduler scheduler, ReminderService reminderService) {
        this.taskService = taskService;
        this.scheduler = scheduler;
        this.reminderService = reminderService;
    }

    public String setReminder(String taskName, String time) {
        if (!taskService.validateTask(taskName)) {
            return "Invalid task!";
        }
        Reminder reminder = new Reminder(taskName, time);
        reminderService.addReminder(reminder);
        scheduler.schedule(reminder);
        return "Reminder set successfully!";
    }

    public List<Reminder> getReminders() {
        return reminderService.getReminders();
    }
} 