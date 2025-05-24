
# SOLID Principle
🔠 What is SOLID?
SOLID is an acronym that represents five core principles of object-oriented design. These principles help developers build software that is:

- Easy to maintain
- Easy to understand
- Flexible to change
- Less prone to bugs
#### SOLID Long Form : 
| Letter | Principle             | FullForm                          |
|--------|-----------------------|-----------------------------------|
| S      | Single Responsibility | A class should have only one reason to change |
| O      | Open/Closed           | Software entities should be open for extension, but closed for modification |
| L      | Liskov Substitution   | Subtypes must be substitutable for their base types |
| I      | Interface Segregation | No client should be forced to depend on methods it does not use |
| D      | Dependency Inversion  | High-level modules should not depend on low-level modules. Both should depend on abstractions |

#### 🎯 Why Do We Need SOLID Principles?
##### ✅ 1. Maintainability
- Changes in one part of the system won't break other parts.
- Makes debugging and enhancements easier.

###### ✅ 2. Scalability
- Easier to add new features without rewriting existing code.

###### ✅ 3. Testability
- Makes unit testing simpler by isolating responsibilities.

###### ✅ 4. Readability
- Code is easier to understand, especially in large teams.

###### ✅ 5. Loose Coupling & High Cohesion
- Encourages designing systems with modular and reusable components.
# 🧱 Open-Closed Principle (O in SOLID)

> **"Software entities (classes, modules, functions) should be open for extension but closed for modification."**

This principle encourages you to **extend existing code** by **adding new behavior**, rather than modifying the existing source code. It helps make your software more **scalable**, **maintainable**, and **less error-prone**.

---

## 💡 Real-World Analogy

A **plug extension board** allows you to plug in new devices without changing the board itself.

Similarly, in software, we should be able to **add new features** without altering the **existing, working code**.

---

## ❌ Without Open-Closed Principle (Bad Design)

```java
class NotificationService {
    public void send(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}
