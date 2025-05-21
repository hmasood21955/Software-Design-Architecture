package code.model;

public class Reminder {
    private String taskName;
    private String time;

    public Reminder(String taskName, String time) {
        this.taskName = taskName;
        this.time = time;
    }

    public String getTaskName() { return taskName; }
    public String getTime() { return time; }
} 