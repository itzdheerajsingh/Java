import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {

        // Creating a queue
        Queue<Integer> q = new LinkedList<>();

        // Add elements (enqueue)
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        // Remove element (dequeue)
        int removed = q.remove();
        System.out.println("Removed element: " + removed);

        // Peek (see front element)
        System.out.println("Front element: " + q.peek());

        // Display queue again
        System.out.println("Updated Queue: " + q);
    }
}