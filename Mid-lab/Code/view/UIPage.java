package code.view;

import code.controller.ReminderController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UIPage extends JFrame {
    private final ReminderController controller;

    public UIPage(ReminderController controller) {
        this.controller = controller;
        setTitle("Set Reminder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        JLabel taskLabel = new JLabel("Task Name:");
        JTextField taskField = new JTextField();
        JLabel timeLabel = new JLabel("Time:");
        JTextField timeField = new JTextField();
        JButton setButton = new JButton("Set Reminder");
        JLabel resultLabel = new JLabel("");

        setButton.addActionListener((ActionEvent e) -> {
            String task = taskField.getText();
            String time = timeField.getText();
            String result = controller.setReminder(task, time);
            resultLabel.setText(result);
        });

        panel.add(taskLabel); panel.add(taskField);
        panel.add(timeLabel); panel.add(timeField);
        panel.add(setButton); panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }
} 