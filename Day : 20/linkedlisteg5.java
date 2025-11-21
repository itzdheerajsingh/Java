class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
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
        newNode.prev = temp;
    }

    // Print forward
    void printForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print backward
    void printBackward() {
        if (head == null) return;

        Node temp = head;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);

        dll.printForward();   // Forward: 10 <-> 20 <-> 30 <-> 40 <-> null
        dll.printBackward();  // Backward: 40 <-> 30 <-> 20 <-> 10 <-> null
    }
}