# Observer Pattern Implementation in Java

This project demonstrates the Observer Pattern using a practical file editor example. It shows how to implement a notification system where multiple observers (listeners) are notified when certain events occur in the main subject (editor).

## Table of Contents
- [What is Observer Pattern?](#what-is-observer-pattern)
- [Project Overview](#project-overview)
- [Detailed Component Explanation](#detailed-component-explanation)
- [Features](#features)
- [Installation and Setup](#installation-and-setup)
- [Usage Guide](#usage-guide)
- [Code Examples](#code-examples)
- [Project Structure](#project-structure)
- [Learning Objectives](#learning-objectives)
- [Common Questions](#common-questions)
- [Contributing](#contributing)
- [License](#license)

## What is Observer Pattern?

The Observer Pattern is a behavioral design pattern that establishes a one-to-many relationship between objects. When one object (the subject) changes its state, all its dependents (observers) are automatically notified and updated.

### Real-World Example
Think of a YouTube channel:
- The channel (subject) posts new videos
- Subscribers (observers) get notified when new content is available
- Each subscriber can choose to watch or ignore the notification

## Project Overview

This implementation uses a file editor as the subject and various notification systems as observers:

### Main Components
1. **Editor (Subject)**
   - The main class that others observe
   - Performs file operations (open/save)
   - Notifies observers of changes

2. **Event Manager**
   - Manages observer subscriptions
   - Handles event distribution
   - Maintains observer list

3. **Observers (Listeners)**
   - LogOpenListener: Records file opens
   - EmailNotificationListener: Sends email alerts
   - SMSSupportListener: Sends SMS with length validation

## Detailed Component Explanation

### 1. Editor Class
```java
public class Editor {
    public EventManager events;
    private String filePath;

    public Editor() {
        this.events = new EventManager("open", "save");
    }
    // ... methods for file operations
}
```
- Manages file operations
- Creates EventManager for handling observers
- Notifies observers of file changes

### 2. EventManager Class
```java
public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();
    
    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }
    // ... other methods
}
```
- Stores observers for each event type
- Handles subscription/unsubscription
- Manages event notifications

### 3. Listeners
Each listener implements the EventListener interface:

#### LogOpenListener
- Records file open operations
- Writes to a log file
- Simple file-based logging

#### EmailNotificationListener
- Sends email notifications
- Simulates email sending
- Customizable recipient

#### SMSSupportListener
- Sends SMS notifications
- Validates message length (max 160 chars)
- Shows warnings for long messages

## Features

### 1. File Operation Monitoring
- Tracks file opens and saves
- Real-time notifications
- Error handling

### 2. Multiple Notification Types
- **Logging**
  - Records file operations
  - Persistent storage
  - Easy to review

- **Email Notifications**
  - Instant alerts
  - Customizable messages
  - Simulated sending

- **SMS Notifications**
  - Length validation
  - Warning system
  - Phone number support

### 3. Error Handling
- Graceful error management
- Clear error messages
- Exception handling

## Installation and Setup

1. **Prerequisites**
   - Java JDK 8 or higher
   - Git (optional)

2. **Installation Steps**
   ```bash
   # Clone the repository
   git clone [repository-url]

   # Navigate to project directory
   cd Design-Patterns

   # Compile the code
   javac src/observer/eventsmanagement/*.java
   ```

3. **Running the Program**
   ```bash
   # Run the demo
   java -cp src observer.eventsmanagement.Demo
   ```

## Usage Guide

1. **Basic Usage**
   ```java
   Editor editor = new Editor();
   editor.events.subscribe("open", new LogOpenListener("log.txt"));
   editor.openFile("test.txt");
   ```

2. **Adding Multiple Listeners**
   ```java
   editor.events.subscribe("save", new EmailNotificationListener("user@example.com"));
   editor.events.subscribe("save", new SMSSupportListener("+1234567890"));
   ```

3. **Testing Different Scenarios**
   - Open files
   - Save files
   - Test error cases

## Code Examples

### 1. Creating an Editor
```java
Editor editor = new Editor();
```

### 2. Setting Up Listeners
```java
editor.events.subscribe("open", new LogOpenListener("file_log.txt"));
editor.events.subscribe("save", new EmailNotificationListener("user@example.com"));
```

### 3. Performing Operations
```java
editor.openFile("document.txt");
editor.saveFile();
```

## Project Structure

```
src/
└── observer/
    └── eventsmanagement/
        ├── Editor.java           # Main subject class
        ├── EventListener.java    # Observer interface
        ├── EventManager.java     # Subscription manager
        ├── LogOpenListener.java  # Log file observer
        ├── EmailNotificationListener.java  # Email observer
        ├── SMSSupportListener.java  # SMS observer
        └── Demo.java             # Example usage
```

## Learning Objectives

### 1. Design Pattern Understanding
- Observer Pattern concepts
- Subject-Observer relationship
- Event-driven programming

### 2. Java Programming
- Interface implementation
- Collections framework
- Exception handling
- File operations

### 3. Software Design Principles
- Single Responsibility Principle
- Open/Closed Principle
- Loose coupling
- High cohesion

## Common Questions

1. **What is the Observer Pattern?**
   - A design pattern for event handling
   - Allows loose coupling between components
   - Enables event-driven programming

2. **Why use this pattern?**
   - Decouples event handling
   - Makes code more maintainable
   - Enables dynamic observer addition/removal

3. **How to add new observers?**
   - Implement EventListener interface
   - Subscribe to desired events
   - Handle notifications in update method

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

### Contribution Guidelines
- Follow Java coding conventions
- Add comments for complex logic
- Include tests for new features
- Update documentation

## License

This project is licensed under the MIT License - see the LICENSE file for details.

### License Terms
- Free to use
- Free to modify
- Free to distribute
- Free to use commercially

## Acknowledgments

- Design Patterns: Elements of Reusable Object-Oriented Software (Gang of Four)
- Java Design Patterns community
- Contributors and maintainers
