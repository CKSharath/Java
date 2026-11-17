
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> students = new ArrayList<>();

        // add() - Adding elements
        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");

        // Display the list
        System.out.println(students);

        // size() - Number of elements
        System.out.println("Size: " + students.size());

        // get() - Access an element using index
        System.out.println("First student: " + students.get(0));

        // set() - Update an element
        students.set(1, "Sneha");

        // contains() - Search for an element
        System.out.println(students.contains("Amit"));

        // remove() - Delete an element
        students.remove("Rahul");

        // Sort in ascending order
        Collections.sort(students);

        System.out.println("After sorting: " + students);

        // clear() - Remove all elements
        students.clear();

        System.out.println("After clearing: " + students);
    }
}
