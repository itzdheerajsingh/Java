public class sortingmerge {
    // Merge Sort function
    public static void mergesort(int arr[], int si, int ei) {
        // Base condition
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;  // or (si + ei) / 2

        // Sort left part
        mergesort(arr, si, mid);

        // Sort right part
        mergesort(arr, mid + 1, ei);

        // Merge both sorted parts
        merge(arr, si, mid, ei);
    }

    // Merge two sorted halves
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;      // left part index
        int j = mid + 1; // right part index
        int k = 0;       // temp index

        // Merge both parts into temp[]
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Leftover elements of left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Leftover elements of right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp[] to original arr[]
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Print the array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String args[]) {
        int arr[] = {1, 4, 3, 5, 6, -9,-45};
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
// time complexity O(nlogn)
//space complexity O(n)