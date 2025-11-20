import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();

        // Add numbers from user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            list.add(num);
        }

        // Print all numbers
        System.out.println("\nNumbers in LinkedList:");
        for (int x : list) {
            System.out.println(x);
        }

        // Remove a number
        System.out.print("\nEnter number to remove: ");
        int removeNum = sc.nextInt();

        if (list.remove((Integer) removeNum)) {
            System.out.println(removeNum + " removed successfully.");
        } else {
            System.out.println("Number not found.");
        }

        System.out.println("Final LinkedList: " + list);

        sc.close();
    }
}