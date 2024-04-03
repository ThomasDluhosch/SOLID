# SOLID Principles

SOLID principles are design principles that encourage the creation of more maintainable, understandable and flexible software.

## Single Responsibility Principle
A class should have one responsibility. It should have only one reason to change.

✔️ Easy maintenance\
✔️ Better collaboration\
✔️ Keeps dependencies to a minimum when reusing classes\
✔️ Decoupling of implementation\
✔️ Effort for development & testing reduced

In the example: An incorrect attempt would be to implement a formatter method and a price calculator method in a single class.
The SRP says that a class should have only one responsibility. So we extract the formatter method and the price calculator method into separate classes.


## Open/Closed Principle
Classes should be **open for extension** and **closed for modification**.
We don't have to modify existing code, which could lead to new bugs. Just extend the code.

✔️ Use of class inheritance  \
✔️ Prevent bugs through extension 


## Liskov Substitution



## Interface Segregation

## Dependency Inversion