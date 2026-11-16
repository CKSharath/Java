
// A class is a blueprint
class Student {

    // Attributes / Properties
    String name;
    int age;
    int marks;

    // Behaviour / Method
    void introduce() {
        System.out.println("Hi, I am " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating the first object
        Student s1 = new Student();
        //The new keyword creates an object by allocating memory for it on the heap and invokes its constructor to initialize it. 
        s1.name = "Rahul";
        s1.age = 18;
        s1.marks = 30;

        // Creating another object
        Student s2 = new Student();

        s2.name = "Priya";
        s2.age = 19;
        s2.marks = 28;

        s1.introduce();
        s2.introduce();
    }
}
