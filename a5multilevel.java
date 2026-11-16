
class Animal {  // Grandparent

    void eat() {
        System.out.println("Eating");
    }
}

class Mammal extends Animal {  // Parent

    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Mammal {  // Child

    void bark() {
        System.out.println("Barking");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // From Animal
        d.walk();  // From Mammal
        d.bark();  // From Dog
    }
}
