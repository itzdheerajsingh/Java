import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbers {
    public static void main(String[] args) {

        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);

        // Print original list
        System.out.println("Original list: " + numbers);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Reverse order
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // Check if list contains an element
        if (numbers.contains(20)) {
            System.out.println("20 is present in the list.");
        } else {
            System.out.println("20 is not present in the list.");
        }

        // Remove an element by index
        numbers.remove(2);
        System.out.println("After removing index 2: " + numbers);

        // Display elements using loop
        System.out.println("\nElements one by one:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Display size
        System.out.println("\nTotal elements: " + numbers.size());
    }
}