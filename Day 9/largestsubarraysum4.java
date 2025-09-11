//kadanes for only negative array
public class largestsubarraysum4 {
    public static void largestsum(int arr[]) {
        int cs = arr[0];       // start from first element
        int ms = arr[0];        // also start from first element

        for (int i = 1; i < arr.length; i++) {
            // either extend the current subarray OR start new from arr[i]
            cs = Math.max(arr[i], cs+ arr[i]);
            ms = Math.max(ms, cs);
        }

        System.out.println("Largest subarray sum is: " + ms);
    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, -1, -4};
        largestsum(arr);
    }
}

