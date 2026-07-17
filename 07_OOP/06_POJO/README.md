# Java POJO (Plain Old Java Object)

## Problem Statement

Create a Student POJO class to store student information. Use constructors, getters, setters, and the `toString()` method to create, update, retrieve, and display student details.

---

## Concepts Covered

- POJO (Plain Old Java Object)
- Instance Variables
- Constructors
- Getters
- Setters
- Method Overriding (`toString()`)
- Object Creation
- Data Encapsulation

---

## What is a POJO?

A **POJO (Plain Old Java Object)** is a simple Java class used to store and transfer data.

A POJO typically contains:
- Private instance variables
- Constructors
- Getters
- Setters
- `toString()` method

POJOs contain little or no business logic and are commonly used with databases, files, and APIs.

---

## Student POJO

The Student class stores the following information:

- Student ID
- Student Name
- Date of Birth
- Class Name

---

## Features

- Create Student objects using a constructor.
- Retrieve values using getters.
- Update values using setters.
- Display object details using the overridden `toString()` method.

---

## Sample Output

```text
----- Student Details -----
Student{id='S923001', name='Priya', dateOfBirth='05-Nov-2004', classList='Java Masterclass'}
Student{id='S923002', name='Moni', dateOfBirth='18-Aug-2004', classList='Java Masterclass'}
Student{id='S923003', name='Oveya', dateOfBirth='10-Jan-2005', classList='Java Masterclass'}

----- Updating Student 2 -----
Student{id='S923002', name='Anu', dateOfBirth='18-Aug-2004', classList='Advanced Java'}

----- Using Getters -----
Student ID : S923001
Student Name : Priya
Class : Java Masterclass
```

---

## POJO Structure

```text
Student
│
├── Instance Variables
├── Constructor
├── Getters
├── Setters
└── toString()
```

---

## Key Takeaways

- POJO stands for **Plain Old Java Object**.
- A POJO is a simple Java class used to store data.
- Constructors initialize object data.
- Getters retrieve values.
- Setters update values.
- `toString()` provides a readable representation of an object.
- POJOs are commonly used for data transfer and database operations.

---

## Learning Outcome

After completing this example, you will understand how to:

- Design a simple POJO class.
- Create and initialize objects.
- Access and modify object data.
- Override the `toString()` method.
- Use POJOs to represent real-world data.
