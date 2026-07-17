# Java Records

## Problem Statement

Create a Student Record to store student information. Create multiple student records, print their details, access data using accessor methods, and understand how records provide immutable data storage with minimal code.

---

## Concepts Covered

- Java Record
- Record Header
- Record Components
- Accessor Methods
- toString()
- Immutability
- Boilerplate Code Reduction

---

## What is a Record?

A Record is a special Java type introduced in JDK 16 that automatically generates common methods such as:

- Constructor
- Accessor Methods
- toString()
- equals()
- hashCode()

Records are mainly used to store immutable data.

---

## Record Syntax

```java
public record Student(
        String id,
        String name,
        String dateOfBirth,
        String classList
) {
}
```

---

## Accessor Methods

```java
student.name();
```

---

## Output

```
===== Student Details =====
Student[id=S923001, name=Priya, dateOfBirth=05-Nov-2004, classList=Java Masterclass]
Student[id=S923002, name=Moni, dateOfBirth=18-Aug-2004, classList=Java Masterclass]
Student[id=S923003, name=Oveya, dateOfBirth=10-Jan-2005, classList=Java Masterclass]

===== Accessor Methods =====
ID          : S923001
Name        : Priya
DOB         : 05-Nov-2004
Class       : Java Masterclass
```

---

## POJO vs Record

| POJO | Record |
|------|--------|
| More Boilerplate Code | Less Boilerplate Code |
| Constructor written manually | Generated automatically |
| Getters written manually | Generated automatically |
| Setters supported | No setters |
| Mutable | Immutable |
| toString() written manually | Generated automatically |

---

## Key Takeaways

- Records reduce boilerplate code.
- Records automatically generate constructors, accessors, `toString()`, `equals()`, and `hashCode()`.
- Records are immutable.
- Records are ideal for storing and transferring data.
