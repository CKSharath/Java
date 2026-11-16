
// Parent class
class Person {

    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name);
    }
}

// Student inherits Person
class Student extends Person {

    int marks;

    void study() {
        System.out.println(name + " is studying");
    }
}

// Teacher also inherits Person
class Teacher extends Person {

    String subject;

    void teach() {
        System.out.println(name + " is teaching");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        // Inherited properties
        s.name = "Rahul";
        s.age = 18;

        // Student's own property
        s.marks = 30;

        s.introduce();
        s.study();
    }
}
