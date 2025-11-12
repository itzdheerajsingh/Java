import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Taking input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }

        // Display all names
        System.out.println("\nNames you entered:");
        for (String name : names) {
            System.out.println(name);
        }

        // Check if a name exists
        System.out.print("\nEnter a name to search: ");
        String search = sc.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " is in the list!");
        } else {
            System.out.println(search + " not found in the list.");
        }

        sc.close();
    }
}