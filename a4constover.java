class Student {

    String name;
    int age;

    // Constructor
    Student(String n, int a) {

        // Initialize object attributes
        name = n;
        age = a;
    }

    Student() {
    name = "Unknown";
    age = 0;
}

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Constructor automatically executes
        Student s1 = new Student();

        Student s2 = new Student("Priya", 19);

        s1.display();
        s2.display();
    }
}
