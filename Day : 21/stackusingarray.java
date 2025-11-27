class Stack {
    int arr[] = new int[5];  // fixed size stack
    int top = -1;

    // push method
    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed");
        }
    }

    // pop method
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    // peek method
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // check empty
    boolean isEmpty() {
        return top == -1;
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.peek());
        System.out.println("Popped: " + st.pop());
        System.out.println("Popped: " + st.pop());

        System.out.println("Is stack empty? " + st.isEmpty());
    }
}