import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Print all elements
        System.out.println("Fruits list: " + fruits);

        // Access element by index
        System.out.println("First fruit: " + fruits.get(0));

        // Modify an element
        fruits.set(1, "Strawberry");
        System.out.println("After update: " + fruits);

        // Remove an element
        fruits.remove("Mango");
        System.out.println("After removal: " + fruits);

        // Loop through ArrayList
        System.out.println("\nLooping through fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get size of ArrayList
        System.out.println("\nTotal fruits: " + fruits.size());
    }
}