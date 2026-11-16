
// Abstract parent class
abstract class Employee {

    String name;

    // Constructor
    Employee(String nam) {
        name = nam;
    }

    // Abstract method: no implementation
    abstract void work();

    // Normal method: has implementation
    void displayName() {
        System.out.println("Employee: " + name);
    }
}

// Child class 1
class Professor extends Employee {

    Professor(String name) {
        super(name);
    }

    // Implementing abstract method
    @Override
    void work() {
        System.out.println("Teaching students");
    }
}

// Child class 2
class Accountant extends Employee {

    Accountant(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Managing college accounts");
    }
}

public class Main {
    public static void main(String[] args) {

        // Cannot create abstract class object
        // Employee e = new Employee("Rahul");

        Employee e1 = new Professor("Sharma");
        Employee e2 = new Accountant("Priya");

        e1.displayName();
        e1.work();

        e2.displayName();
        e2.work();
    }
}
