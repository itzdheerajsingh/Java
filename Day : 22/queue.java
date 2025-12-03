import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Remove element
        int removed = queue.remove();
        System.out.println("Removed: " + removed);

        // Check front element
        int front = queue.peek();
        System.out.println("Front: " + front);

        // Queue after operations
        System.out.println("Updated Queue: " + queue);
    }
}
