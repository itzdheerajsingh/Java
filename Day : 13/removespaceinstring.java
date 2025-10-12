import java.util.Scanner;

public class removespaceinstring {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove all spaces using replaceAll() method
        str = str.replaceAll(" ", "");

        // Display the result
        System.out.println("String without spaces: " + str);

        // Close scanner
        sc.close();
    }
}