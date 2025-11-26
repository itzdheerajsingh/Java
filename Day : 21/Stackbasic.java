import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements into stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element from stack
        System.out.println("Popped: " + stack.pop());

        // Stack after pop
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
