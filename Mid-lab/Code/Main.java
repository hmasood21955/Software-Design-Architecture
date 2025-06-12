
import code.controller.ReminderController;
import code.service.NotificationScheduler;
import code.service.ReminderService;
import code.service.TaskService;
import code.view.UIPage;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        NotificationScheduler scheduler = new NotificationScheduler();
        ReminderService reminderService = new ReminderService();
        ReminderController controller = new ReminderController(taskService, scheduler, reminderService);
        new UIPage(controller);
    }
} 