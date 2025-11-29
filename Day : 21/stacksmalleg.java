class StackSmall {
    int arr[] = new int[5];
    int top = -1;

    void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        return (top == -1) ? -1 : arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackSmall st = new StackSmall();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Peek: " + st.peek());
        System.out.println("Pop: " + st.pop());
        System.out.println("Pop: " + st.pop());
        System.out.println("Is Empty? " + st.isEmpty());
    }
}