import java.util.*;

public class QueueArray {
    int front, rear, size;
    int capacity;
    int arr[];

    // Constructor
    QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is FULL!");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println(data + " added to queue");
    }

    // Dequeue
    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is EMPTY!");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    // Peek
    int peek() {
        if (size == 0) {
            System.out.println("Queue is EMPTY!");
            return -1;
        }
        return arr[front];
    }

    // Display
    void display() {
        if (size == 0) {
            System.out.println("Queue is EMPTY!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front item: " + q.peek());
    }
}