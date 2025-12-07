import java.util.Queue;
import java.util.LinkedList;

public class BasicQueueExample {

    public static void main(String[] args) {
        // Declaration and Initialization
        Queue<String> taskQueue = new LinkedList<>();

        // 1. Adding Elements (enqueue)
        taskQueue.add("Task A: Process Payment");
        taskQueue.add("Task B: Send Confirmation Email");
        taskQueue.offer("Task C: Update Database Record"); // offer() is preferred

        System.out.println("Current Queue: " + taskQueue);
        // Output: Current Queue: [Task A: Process Payment, Task B: Send Confirmation Email, Task C: Update Database Record]

        // 2. Viewing the Head Element (peek)
        String headTask = taskQueue.peek();
        System.out.println("Head of Queue (Next to be processed): " + headTask);
        // Output: Head of Queue (Next to be processed): Task A: Process Payment

        // 3. Removing the Head Element (dequeue)
        String processedTask = taskQueue.poll(); // poll() is preferred
        System.out.println("Processed Task: " + processedTask);
        // Output: Processed Task: Task A: Process Payment

        // 4. Check the size and new head
        System.out.println("Queue size after poll: " + taskQueue.size());
        System.out.println("New Head of Queue: " + taskQueue.peek());
        // Output: New Head of Queue: Task B: Send Confirmation Email
    }
}
