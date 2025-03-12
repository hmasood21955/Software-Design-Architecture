
# Vehicle Movement Example

This repository demonstrates the difference between implementing a vehicle movement system **with principles** (using polymorphism and inheritance) and **without principles** (repetitive and less flexible code).

---

## **With Principles**

### Overview
In this version, we use **polymorphism** and **inheritance** to create a flexible and reusable system for different types of vehicles.

### Key Features:
- A base class `Vehicle` with a `move()` method.
- Subclasses (`Car`, `Bike`, `Plane`) that **override** the `move()` method to provide their own behavior.
- Polymorphism allows us to treat all vehicles as the base type (`Vehicle`) while still calling their specific `move()` implementation.

### Benefits:
1. **Code Reusability:** The `move()` method is defined once in the base class and reused in subclasses.
2. **Flexibility:** You can easily add new vehicles (e.g., `Truck`, `Helicopter`) without changing existing code.
3. **Polymorphism:** You can treat all vehicles as the base type (`Vehicle`) and still call their specific behavior.

---

## **Without Principles**

### Overview
In this version, we avoid using principles like polymorphism and inheritance. Each vehicle class has its own `move()` method, leading to repetitive and less maintainable code.

### Key Features:
- No base class or inheritance.
- Each vehicle class (`Car`, `Bike`, `Plane`) has its own `move()` method.
- No flexibility to treat vehicles as a single type.

### Drawbacks:
1. **Code Duplication:** Each vehicle class has its own `move()` method, leading to repetitive code.
2. **No Flexibility:** You cannot treat all vehicles as a single type (e.g., store them in a list and call `move()` in a loop).
3. **Harder to Maintain:** Adding new vehicles requires writing new `move()` methods, and changes must be made in multiple places.

---

## **Why Principles Matter**
Using principles like **polymorphism** and **inheritance** makes your code:
- **Reusable:** Avoids duplication by reusing code from a base class.
- **Flexible:** Allows you to add new functionality without modifying existing code.
- **Maintainable:** Changes need to be made in only one place, reducing the risk of errors.

---

## **How to Run the Code**
1. Clone this repository.
2. Open the project in your favorite IDE (e.g., IntelliJ, Eclipse).
3. Run the `Main` class to see the output for both versions.

---

## **Contributing**
Feel free to contribute to this project! If you have suggestions or improvements, open an issue or submit a pull request.

---

This README explains the importance of coding principles and how they improve the quality of your code, without including actual code snippets. 
