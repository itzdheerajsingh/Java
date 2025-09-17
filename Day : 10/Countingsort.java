public class Countingsort {

    // Method to print array elements
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // Counting sort function
    public static void countingSort(int arr[]) {
        if (arr.length == 0) return;

        // Step 1: Find the max value
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        largest=Math.max(largest,arr[i]);
        }
                                                                                 /*
                                                                                 or use this
                                                                                     int max = arr[0];
                                                                                     for (int num : arr) {
                                                                                     if (num > max) max = num;
                                                                                 }
                                                                                */

        // Step 2: Create count array
        int count[] = new int[largest + 1];

        // Step 3: Store frequency of each number
        for (int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }

        // Step 4: Place elements back into arr or sorting
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    // Main method
    public static void main(String args[]) {
        int arr[] = {2,1,4,1,7,5,7,6};
        System.out.println("Before Sorting:");
        printArr(arr);

        countingSort(arr);

        System.out.println("After Sorting:");
        printArr(arr);
    }
}

