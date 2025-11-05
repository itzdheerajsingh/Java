import java.util.*;

public class CombinationSumBacktracking {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, 0, target, new ArrayList<>(), result);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }

    public static void backtrack(int[] arr, int index, int target, List<Integer> current, List<List<Integer>> result) {
        // Base case: found valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Base case: out of bounds or negative target
        if (index == arr.length || target < 0) return;

        // Choice 1: include arr[index] (can reuse same element)
        current.add(arr[index]);
        backtrack(arr, index, target - arr[index], current, result);

        // Backtrack: remove last added
        current.remove(current.size() - 1);

        // Choice 2: move to next element
        backtrack(arr, index + 1, target, current, result);
    }
}
