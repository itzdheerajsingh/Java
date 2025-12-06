import java.util.*;

public class QueueArrayDeque {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        // Removes head
        System.out.println("Removed: " + queue.poll());

        // Peek head
        System.out.println("Front: " + queue.peek());

        System.out.println("Updated Queue: " + queue);
    }
}