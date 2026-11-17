
class Parent {

    String name = "Rahul";

    // 3. Parent constructor
    Parent() {
        System.out.println("Parent constructor called");
    }

    // 2. Parent method
    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {

    String name = "Priya";

    Child() {
        // 3. Calling parent constructor
        super();

        System.out.println("Child constructor called");
    }

    void show() {

        // 1. Access parent variable
        System.out.println("Parent name: " + super.name);

        // Access child variable
        System.out.println("Child name: " + name);

        // 2. Calling parent method
        super.display();
    }
}

public class Main {

    public static void main(String[] args) {

        Child c = new Child();

        c.show();
    }
}
