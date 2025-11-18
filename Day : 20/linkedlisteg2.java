import java.util.LinkedList;

public class LinkedListNumbers {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Loop through
        System.out.println("Numbers:");
        for (int num : list) {
            System.out.println(num);
        }

        // Remove
        list.remove(2);  // remove index 2 (30)

        System.out.println("After removal: " + list);
    }
}
