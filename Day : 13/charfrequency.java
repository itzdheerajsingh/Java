import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask user for a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Create frequency array of ASCII size (256 characters)
        int[] freq = new int[256];

        // Convert string to character array and count frequency
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        // Display the frequency of each character
        System.out.println("\nCharacter frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }

        // Close scanner
        sc.close();
    }
}