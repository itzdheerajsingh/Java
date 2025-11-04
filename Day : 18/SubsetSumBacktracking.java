import java.util.*;

public class SubsetSumBacktracking {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int target = 8;

        List<List<Integer>> result = new ArrayList<>();
        findSubsets(arr, 0, target, new ArrayList<>(), result);

        System.out.println("Subsets that sum to " + target + ":");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    public static void findSubsets(int[] arr, int index, int target, List<Integer> current, List<List<Integer>> result) {
        // Base case: target achieved
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // If end of array or target becomes negative
        if (index == arr.length || target < 0) {
            return;
        }

        // Include current element
        current.add(arr[index]);
        findSubsets(arr, index + 1, target - arr[index], current, result);

        // Exclude current element (backtrack)
        current.remove(current.size() - 1);
        findSubsets(arr, index + 1, target, current, result);
    }
}
