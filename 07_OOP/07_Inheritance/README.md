# Java Inheritance

## Problem Statement

Create Java classes to demonstrate **Inheritance**, where a child class inherits the properties and behaviors of a parent class. Show how inherited fields and methods can be accessed and reused.

---

## Concepts Covered

- Inheritance
- Parent (Superclass)
- Child (Subclass)
- `extends` Keyword
- Method Inheritance
- Code Reusability
- Method Overriding (if implemented)

---

## What is Inheritance?

**Inheritance** is an Object-Oriented Programming (OOP) concept that allows one class to inherit the fields and methods of another class.

It helps reduce code duplication and promotes code reusability.

---

## Key Terms

- **Superclass (Parent Class)** – The class whose members are inherited.
- **Subclass (Child Class)** – The class that inherits from the parent class.
- **extends** – Keyword used to inherit a class.

Example:

```java
class Animal {
}

class Dog extends Animal {
}
```

---

## Features

- Reuse existing code from a parent class.
- Add new fields and methods in the child class.
- Override inherited methods when required.
- Create a hierarchical relationship between classes.

---

## Example Hierarchy

```text
Animal
│
├── name
├── age
├── eat()
└── sleep()

        ▲
        │ extends

Dog
│
├── breed
└── bark()
```

---

## Benefits of Inheritance

- Code Reusability
- Reduced Code Duplication
- Easier Maintenance
- Better Code Organization
- Supports Method Overriding and Polymorphism

---

## Sample Output

```text
Animal is eating...
Animal is sleeping...
Dog is barking...
```

---

## Key Takeaways

- Inheritance allows a child class to inherit fields and methods from a parent class.
- The `extends` keyword is used to create an inheritance relationship.
- Child classes can use inherited members directly.
- Child classes can also define their own unique fields and methods.
- Inheritance promotes code reuse and improves maintainability.

---

## Learning Outcome

After completing this example, you will understand how to:

- Create parent and child classes.
- Use the `extends` keyword.
- Access inherited fields and methods.
- Add new functionality in child classes.
- Apply inheritance to build reusable and organized Java programs.
