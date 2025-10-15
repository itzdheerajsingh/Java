import java.util.Scanner;

public class StringUseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // 1. Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        // 2. Check if palindrome
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        // 3. Count vowels
        int vowelCount = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        // 4. Convert to uppercase & lowercase
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        sc.close();
    }
}