import java.util.Arrays;
import java.util.Collections;

public class inbuilt_reverse {

    // Method to print array elements
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Inbuilt sort
    public static void main(String args[]) {
        Integer arr[] = {1, 5, 3, 7, 2};  // Integer (object type), not int

        // // Reverse sort whole array
        // Arrays.sort(arr, Collections.reverseOrder());
        // printArr(arr);

        // Sort index 0 to 2 (part of array)
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);
    }
}
