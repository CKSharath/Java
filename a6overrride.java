
class Person {

    // Parent class method
    void introduce() {
        System.out.println("I am a person");
    }
}

class Student extends Person {

    // Child class overrides parent's method
    @Override
    void introduce() {
        System.out.println("I am a student");
    }
}

class Teacher extends Person {

    // Child class overrides parent's method
    @Override
    void introduce() {
        System.out.println("I am a teacher");
    }
}

public class Main {

    public static void main(String[] args) {

        // Parent reference pointing to Student object
        Person p1 = new Student();

        // Parent reference pointing to Teacher object
        Person p2 = new Teacher();

        p1.introduce();
        p2.introduce();
    }
}
