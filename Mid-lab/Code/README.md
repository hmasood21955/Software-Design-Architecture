# Reminder Application

A professional Java-based Reminder Application built using the MVC (Model-View-Controller) pattern, following SOLID principles and DRY (Don't Repeat Yourself) principle.

## Features

- Set reminders with task names and times
- View all set reminders in a scrollable list
- Automatic list updates when adding new reminders
- Manual refresh option
- Input validation
- Clean and intuitive user interface

## Project Structure

```
Code/
├── Main.java                 # Application entry point
├── model/
│   └── Reminder.java        # Reminder data model
├── view/
│   └── UIPage.java          # GUI implementation
├── controller/
│   └── ReminderController.java  # Business logic controller
└── service/
    ├── TaskService.java         # Task validation service
    ├── NotificationScheduler.java # Reminder scheduling service
    └── ReminderService.java      # Reminder management service
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any operating system that supports Java

## How to Run

1. **Compile the code:**
   ```bash
   cd Mid-lab/Code
   javac -d . Main.java model/*.java service/*.java controller/*.java view/*.java
   ```

2. **Run the application:**
   ```bash
   java code.Main
   ```

## Usage Guide

1. **Setting a Reminder:**
   - Enter a task name in the "Task Name" field
   - Enter a time in the "Time" field (e.g., "14:30")
   - Click "Set Reminder"

2. **Viewing Reminders:**
   - All reminders are displayed in the list below
   - Use the scroll bar to view more reminders
   - Click "Refresh List" to manually update the list

3. **Input Validation:**
   - Both task name and time fields must be filled
   - Empty fields will show an error message

## Architecture

The application follows the MVC pattern:

- **Model:** `Reminder.java` - Represents the data structure
- **View:** `UIPage.java` - Handles the user interface
- **Controller:** `ReminderController.java` - Manages the business logic
- **Services:** Handle specific functionalities like task validation and scheduling

## Design Principles

- **SOLID Principles:**
  - Single Responsibility Principle
  - Open/Closed Principle
  - Liskov Substitution Principle
  - Interface Segregation Principle
  - Dependency Inversion Principle

- **DRY Principle:**
  - No code duplication
  - Reusable components
  - Clean architecture

## Contributing

Feel free to contribute to this project by:
1. Forking the repository
2. Creating a new branch
3. Making your changes
4. Submitting a pull request

## License

This project is open source and available under the MIT License. 