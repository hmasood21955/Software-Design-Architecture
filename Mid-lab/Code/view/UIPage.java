package code.view;

import code.controller.ReminderController;
import code.model.Reminder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.*;

public class UIPage extends JFrame {
    private final ReminderController controller;
    private final DefaultListModel<String> reminderListModel = new DefaultListModel<>();
    private final JList<String> reminderList = new JList<>(reminderListModel);

    public UIPage(ReminderController controller) {
        this.controller = controller;
        setTitle("Reminder App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create input panel
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        JLabel taskLabel = new JLabel("Task Name:");
        JTextField taskField = new JTextField();
        JLabel timeLabel = new JLabel("Time:");
        JTextField timeField = new JTextField();
        JButton setButton = new JButton("Set Reminder");
        JLabel resultLabel = new JLabel("");

        // Add components to input panel
        inputPanel.add(taskLabel);
        inputPanel.add(taskField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeField);
        inputPanel.add(setButton);
        inputPanel.add(resultLabel);

        // Create reminder list panel
        JPanel listPanel = new JPanel(new BorderLayout(5, 5));
        JLabel listLabel = new JLabel("Your Reminders:");
        JScrollPane scrollPane = new JScrollPane(reminderList);
        JButton refreshButton = new JButton("Refresh List");

        listPanel.add(listLabel, BorderLayout.NORTH);
        listPanel.add(scrollPane, BorderLayout.CENTER);
        listPanel.add(refreshButton, BorderLayout.SOUTH);

        // Add panels to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(listPanel, BorderLayout.CENTER);

        // Add action listeners
        setButton.addActionListener((ActionEvent e) -> {
            String task = taskField.getText();
            String time = timeField.getText();
            if (task.isEmpty() || time.isEmpty()) {
                resultLabel.setText("Please fill both fields!");
                return;
            }
            String result = controller.setReminder(task, time);
            resultLabel.setText(result);
            taskField.setText("");
            timeField.setText("");
            refreshReminders();
        });

        refreshButton.addActionListener((ActionEvent e) -> refreshReminders());

        // Add main panel to frame
        add(mainPanel);
        
        // Initial load of reminders
        refreshReminders();
        setVisible(true);
    }

    private void refreshReminders() {
        reminderListModel.clear();
        List<Reminder> reminders = controller.getReminders();
        if (reminders.isEmpty()) {
            reminderListModel.addElement("No reminders set yet");
        } else {
            for (Reminder r : reminders) {
                reminderListModel.addElement(String.format("Task: %s | Time: %s", 
                    r.getTaskName(), r.getTime()));
            }
        }
    }
} 