# ☕ Java OOP Practice

My personal Java practice repository covering **Object-Oriented Programming (OOP)**, **Exception Handling**, **Patterns**, and **JDBC** — organized from easy to hard.

---

## 📁 Folder Structure

```
Java-Final/
│
├── OOP/
│   ├── 01_Class_and_Object/
│   ├── 02_Constructor/
│   ├── 03_Methods/
│   ├── 04_Encapsulation/
│   ├── 05_Static_Variables/
│   ├── 06_Static_Methods/
│   ├── 07_Inheritance_Single/
│   ├── 08_Inheritance_Multilevel/
│   ├── 09_Inheritance_Hierarchical/
│   ├── 10_Inheritance_Hybrid/
│   ├── 11_Inheritance_Multiple_NotSupported/
│   ├── 12_Polymorphism_Overloading/
│   ├── 13_Polymorphism_Overriding/
│   ├── 14_Polymorphism_Runtime/
│   ├── 15_Abstraction_AbstractClass/
│   └── 16_Abstraction_Interface/
│
├── ExceptionHandling/
│   ├── 01_ArithmeticException/
│   ├── 02_NullPointerException/
│   ├── 03_NumberFormatException/
│   ├── 04_StringIndexOutOfBoundsException/
│   └── 05_Finally/
│
├── Patterns/
├── JDBC/
├── Extras/
├── Thread/
└── README.md
```

---

## 🏛️ OOP Four Pillars

| Pillar | Topics Covered |
|---|---|
| 🔒 **Encapsulation** | Private fields, access control |
| 🧬 **Inheritance** | Single, Multilevel, Hierarchical, Hybrid, Multiple (Not Supported) |
| 🔄 **Polymorphism** | Overloading, Overriding, Runtime, Deep Dive |
| 🎭 **Abstraction** | Abstract Class, Interface |

---

## 📚 OOP Topics

| # | Folder | What I Practiced |
|---|---|---|
| 01 | `Class_and_Object` | Creating a class, making objects, accessing fields |
| 02 | `Constructor` | Parameterized constructor to set data at creation |
| 03 | `Methods` | Setter and display methods |
| 04 | `Encapsulation` | Private fields, controlled access via methods |
| 05 | `Static_Variables` | Shared fields, counter, auto-ID, constant PI, book tracker |
| 06 | `Static_Methods` | Utility method, modifying shared field, static vs instance |
| 07 | `Inheritance_Single` | Father→Son, Mother→Daughter |
| 08 | `Inheritance_Multilevel` | Grandfather→Father→Son chain, Game character chain |
| 09 | `Inheritance_Hierarchical` | Father→Son+Daughter, Boss→Wife+Child |
| 10 | `Inheritance_Hybrid` | Grandfather→Father→Son+Daughter combined |
| 11 | `Inheritance_Multiple_NotSupported` | Why Java doesn't allow it (Diamond Problem) |
| 12 | `Polymorphism_Overloading` | Same method name, different parameter types |
| 13 | `Polymorphism_Overriding` | Child class overrides parent method |
| 14 | `Polymorphism_Runtime` | Dynamic Method Dispatch, Upcasting, Downcasting |
| 15 | `Abstraction_AbstractClass` | Shape area, Bike run, Bank interest rate |
| 16 | `Abstraction_Interface` | Printable, Drawable, SmartDevice |

---

## 🔴 Exception Handling

| # | Folder | What It Handles |
|---|---|---|
| 01 | `ArithmeticException` | Division by zero |
| 02 | `NullPointerException` | Calling method on null object |
| 03 | `NumberFormatException` | Parsing invalid string to int |
| 04 | `StringIndexOutOfBoundsException` | Invalid string index |
| 05 | `Finally` | finally block always runs (2 examples) |

---

## 🔢 Patterns (Easy → Hard)

| File | Pattern | Difficulty |
|---|---|---|
| `Pattern1.java` | Number triangle → 1, 1 2, 1 2 3 | ⭐ Easy |
| `Patt3.java` | Star triangle → *, * *, * * * | ⭐ Easy |
| `patt4.java` | Row number repeated → 1, 2 2, 3 3 3 | ⭐ Easy |
| `Patt2.java` | Alphabet triangle → A, A B, A B C | ⭐⭐ Medium |
| `Patt5.java` | Same letter per row → A, B B, C C C | ⭐⭐ Medium |
| `Patt6.java` | Right-aligned star triangle | ⭐⭐⭐ Hard |
| `Patt7.java` | Right-aligned number triangle | ⭐⭐⭐ Hard |

---

## 🗄️ JDBC

| File | Description |
|---|---|
| `JDBC.java` | Connect to MySQL, run SELECT, print results |

> Requires MySQL running on `localhost:3306`, database `64_a`, table `signup`, and MySQL Connector/J JAR in classpath.

---

## 🧩 Extras

| File | Description |
|---|---|
| `practise.java` | Filter characters from string input using loop + continue |

---

## 🧵 Thread (Multithreading)

| File | What it does |
|---|---|
| `multithreading.java` | Basic thread by extending Thread class, calls `start()` |
| `Multithread_2.java` | Thread using Runnable interface |
| `multithread_3.java` | `Thread.sleep()` — two threads printing 0–4 with 500ms delay |
| `multithread_4.java` | What happens when `start()` is called twice on same thread |
| `multithread_5.java` | Difference between calling `run()` directly vs `start()` |
| `joinmethod.java` | `join(1500)` — t1 runs for 1500ms, then t2 and t3 start |
| `joinmethod_1.java` | `join()` — t1 fully finishes before t2 and t3 start |

---

## ▶️ How to Run

```bash
# Compile
javac FileName.java

# Run
java ClassName
```

**Example:**
```bash
javac Class1.java
java Class1
```

---

## 🛠️ Requirements

- Java JDK 8 or higher
- IDE: IntelliJ IDEA / Eclipse / VS Code
- For JDBC: MySQL Server + MySQL Connector/J JAR

---

## 👨‍💻 Author

**MD. Abdullah Al Sami Mirza**
