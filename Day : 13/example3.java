import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        // Step 1: Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Step 2: Convert to char array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("✅ Strings are Anagrams");
        } else {
            System.out.println("❌ Strings are NOT Anagrams");
        }
    }
}