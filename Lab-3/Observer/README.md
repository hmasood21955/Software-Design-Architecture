

# Observer Pattern - Java Implementation

This repository demonstrates the **Observer Design Pattern** implemented in Java. It was developed as part of the **Software Design and Architecture Lab-3** coursework.

## 📚 Overview
The **Observer Pattern** is a behavioral design pattern where an object (called the **Subject**) maintains a list of dependents (**Observers**) and notifies them automatically of any state changes. It's typically used to implement distributed event handling systems.

This project demonstrates:
- A `Subject` that holds a state.
- Observers (`HexaObserver`, `BinaryObserver`, `OctalObserver`) that react to state changes.
- A simple event notification system.

---

## 📁 Project Structure
```
src/
├── EventManager/
│   ├── Demo.java
│   ├── Editor.java
│   ├── EmailNotificationListener.java
│   ├── EventListener.java
│   ├── EventManager.java
│   ├── LogOpenListener.java
│   └── SMSSupportListener.java
└── Observer/
    ├── BinaryObserver.java
    ├── HexaObserver.java
    ├── OctalObserver.java
    ├── Observer.java
    ├── ObserverPatternDemo.java
    └── Subject.java
```

---

## 🚀 How It Works

1. **Subject.java**
   - Holds the list of observers.
   - Updates state and notifies all observers when a change occurs.

2. **Observer.java (Interface)**
   - Defines the `update()` method that each observer implements.

3. **Concrete Observers**
   - `BinaryObserver.java`
   - `HexaObserver.java`
   - `OctalObserver.java`
   - These classes implement the `Observer` interface and display the subject's state in different formats.

4. **ObserverPatternDemo.java**
   - Demonstrates how to create a subject, attach observers, and change the subject's state.

---

## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/observer-pattern-java.git
   cd observer-pattern-java
   ```

2. Compile the Java files:
   ```bash
   javac src/Observer/*.java
   ```

3. Run the demo:
   ```bash
   java src/Observer/ObserverPatternDemo
   ```

---

## 🛠️ Tools & Technologies
- **Java SE 8+**
- **VS Code** (with Red Hat Java extensions)
- **Git**

---

## 📄 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.


