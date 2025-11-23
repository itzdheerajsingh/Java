class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseLinkedList {
    Node head;

    // Add node at end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Reverse linked list
    void reverse() {
        Node prev = null;
        Node curr = head;
        Node nextNode;

        while (curr != null) {
            nextNode = curr.next;   // store next
            curr.next = prev;       // reverse pointer

            prev = curr;            // move prev ahead
            curr = nextNode;        // move curr ahead
        }

        head = prev;  // new head
    }

    // Print list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}