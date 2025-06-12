# Java MVC Student Project

## Overview
This project demonstrates the Model-View-Controller (MVC) pattern in Java using a simple Student example. The application allows you to create a student, update their details, and display a summary using a clean, professional code structure.

## Project Structure
```
src/
├── Main.java
├── model/
│   ├── Student.java
│   └── StudentSummary.java
├── view/
│   └── View.java
└── controller/
    └── Controller.java
```

## How to Compile
1. Open a terminal and navigate to the `src` directory:
   ```sh
   cd "Lab-08/Model View Controller/src"
   ```
2. Compile all Java files:
   ```sh
   javac model/*.java view/*.java controller/*.java Main.java
   ```

## How to Run
After compiling, run the program with:
```sh
java Main
```

## Usage
- The program creates a `Student` object, displays its details, updates the details, and displays them again.
- Output will look like:
  ```
  Student: Ali, Roll No: 101, Marks: 89.5
  Student: Sara, Roll No: 102, Marks: 95.0
  ```

## Design Principles
- **MVC Pattern:** Separates data (Model), user interface (View), and business logic (Controller).
- **Clean Code:** Each class is in its own file and package for maintainability.

## Customization
- You can extend the `Student` class with more attributes.
- You can add more views or controllers for additional features.

## License
This project is open source and free to use for educational purposes. 