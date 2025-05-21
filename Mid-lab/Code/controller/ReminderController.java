package code.controller;

import code.model.Reminder;
import code.service.TaskService;
import code.service.NotificationScheduler;

public class ReminderController {
    private final TaskService taskService;
    private final NotificationScheduler scheduler;

    public ReminderController(TaskService taskService, NotificationScheduler scheduler) {
        this.taskService = taskService;
        this.scheduler = scheduler;
    }

    public String setReminder(String taskName, String time) {
        if (!taskService.validateTask(taskName)) {
            return "Invalid task!";
        }
        Reminder reminder = new Reminder(taskName, time);
        scheduler.schedule(reminder);
        return "Reminder set successfully!";
    }
} 