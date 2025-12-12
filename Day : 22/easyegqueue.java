import java.util.Queue;
import java.util.LinkedList;

public class BeginnerQueue {
    public static void main(String[] args) {

        // Create a Queue of Strings
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove (dequeue) one element
        String removed = queue.remove();
        System.out.println("Removed: " + removed);

        // Check the first element (front of queue)
        System.out.println("Front element: " + queue.peek());

        // Print queue again
        System.out.println("Updated Queue: " + queue);
    }
}