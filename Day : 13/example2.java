import java.util.Scanner;

public class StringBasicExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // 1. Count characters
        System.out.println("Total characters (with spaces): " + sentence.length());

        // 2. Count characters (without spaces)
        String noSpace = sentence.replace(" ", "");
        System.out.println("Total characters (without spaces): " + noSpace.length());

        // 3. Count words
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Total words: " + words.length);

        // 4. Print each word separately
        System.out.println("Words in the sentence:");
        for (String w : words) {
            System.out.println(w);
        }

        sc.close();
    }
}