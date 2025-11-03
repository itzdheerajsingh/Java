import java.util.*;

public class PermutationsBacktracking {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length]; // track used elements

        backtrack(arr, used, new ArrayList<>(), result);

        // Print all permutations
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    // Backtracking function
    public static void backtrack(int[] arr, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        // Base case: if current permutation is complete
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            // Skip used elements
            if (used[i]) continue;

            // Choose element
            current.add(arr[i]);
            used[i] = true;

            // Recurse
            backtrack(arr, used, current, result);

            // Undo choice (Backtrack)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
