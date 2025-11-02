import java.util.*;

public class BacktrackingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, new ArrayList<>(), result);

        // Print all subsets
        System.out.println(result);
    }

    // Backtracking function
    public static void backtrack(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we've considered all elements
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // store current subset
            return;
        }

        // Choice 1: Include arr[index]
        current.add(arr[index]);
        backtrack(arr, index + 1, current, result);

        // Backtrack step: remove last added element
        current.remove(current.size() - 1);

        // Choice 2: Exclude arr[index]
        backtrack(arr, index + 1, current, result);
    }
}
