import java.util.ArrayList;

public class NestedArrayListExample {
    public static void main(String[] args) {

        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Adding 3 rows
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());  // each row is an ArrayList
        }

        // Adding values
        list.get(0).add(10);
        list.get(0).add(20);
        list.get(0).add(30);

        list.get(1).add(40);
        list.get(1).add(50);

        list.get(2).add(60);
        list.get(2).add(70);
        list.get(2).add(80);
        list.get(2).add(90);

        // Printing the 2D ArrayList
        System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }

        // Accessing a specific value
        System.out.println("\nElement at row 2, column 3: " + list.get(2).get(1));
    }
}