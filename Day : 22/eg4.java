import java.util.Scanner;

class Queue {
    int[] arr = new int[5];
    int front = 0;
    int rear = -1;

    // Enqueue
    void enqueue(int data) {
        if (rear == arr.length - 1) {
            System.out.println("Queue is FULL");
            return;
        }
        rear++;
        arr[rear] = data;
        System.out.println(data + " inserted");
    }

    // Dequeue
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is EMPTY");
            return;
        }
        System.out.println("Deleted: " + arr[front]);
        front++;
    }

    // Display
    void display() {
        if (front > rear) {
            System.out.println("Queue is EMPTY");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int choice;

        do {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 4);

        sc.close();
    }
}