# Observer Pattern Examples in Java

This repository contains two simple implementations of the Observer Pattern:
1. Basic Number Converter
2. File Event Notifier

## 1. Basic Number Converter 📊
Converts a number into different formats when the number changes.

### What it does:
- Takes a number input
- Automatically converts to:
  - Binary (Base 2)
  - Octal (Base 8)
  - Hexadecimal (Base 16)
- Can attach/detach observers at runtime

### Example:
```java
Subject subject = new Subject();
new BinaryObserver(subject);    // Watches for binary conversion
new OctalObserver(subject);     // Watches for octal conversion
subject.setState(15);           // All observers will show conversions
```

## 2. File Event Notifier 📁
Notifies different observers when files are opened or saved.

### Features:
- 📝 Log File: Records when files are opened
- 📧 Email: Sends notifications when files are saved
- 📱 SMS: Sends text messages (with 160-char limit check)

### Example:
```java
Editor editor = new Editor();
editor.events.subscribe("open", new LogOpenListener("log.txt"));
editor.events.subscribe("save", new EmailNotificationListener("user@email.com"));
editor.events.subscribe("save", new SMSSupportListener("+1234567890"));
```

## How to Run 🚀

1. Clone the repository
2. Navigate to the src folder
3. Run either:
   - `ObserverPatternDemo.java` for number converter
   - `Demo.java` for file notifications

## Project Structure 📂
src/observer/
├── basicobserverpattern/ # Number converter
│ ├── Subject.java
│ ├── Observer.java
│ └── Observer.java files
│
└── eventsmanagement/ # File notifier
├── Editor.java
├── EventManager.java
└── Listener.java files


## Learning Points 📚
- Observer Pattern basics
- Event handling
- Java interfaces
- Error handling
- File operations

## Requirements ⚙️
- Java JDK 8 or higher
- Any Java IDE (optional)

---
Made with Java ☕
