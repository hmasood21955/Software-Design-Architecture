package code.service;

public class TaskService {
    public boolean validateTask(String taskName) {
        // For demo, all tasks are valid
        return taskName != null && !taskName.trim().isEmpty();
    }
} 