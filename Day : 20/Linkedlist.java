import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        // Add elements
        names.add("Dheeraj");
        names.add("Riya");
        names.add("Aman");

        // Print list
        System.out.println("LinkedList: " + names);

        // Add at first & last
        names.addFirst("Start");
        names.addLast("End");

        System.out.println("After adding first & last: " + names);

        // Remove elements
        names.removeFirst();
        names.removeLast();

        System.out.println("After removing first & last: " + names);

        // Access element
        System.out.println("First element: " + names.getFirst());
    }
}
