import java.util.LinkedList;

public class SimpleLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Print LinkedList
        System.out.println("LinkedList: " + list);

        // Remove an element
        list.remove("Banana");

        // Print again
        System.out.println("After removal: " + list);

        // Access an element
        System.out.println("First element: " + list.getFirst());
    }
}