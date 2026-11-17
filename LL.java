
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> students = new LinkedList<>();

        // add() - Add elements
        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");

        System.out.println(students);

        // addFirst() - Insert at beginning
        students.addFirst("Sneha");

        // addLast() - Insert at end
        students.addLast("Kiran");

        System.out.println(students);

        // getFirst() - Retrieve first element
        System.out.println("First: " + students.getFirst());

        // getLast() - Retrieve last element
        System.out.println("Last: " + students.getLast());

        // peek() - Retrieve first element without deleting
        System.out.println("Peek: " + students.peek());

        // poll() - Retrieve and delete first element
        System.out.println("Poll: " + students.poll());

        // removeFirst() - Delete first element
        students.removeFirst();

        // removeLast() - Delete last element
        students.removeLast();

        System.out.println("Final List: " + students);
    }
}
