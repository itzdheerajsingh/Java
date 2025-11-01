public class quicksorting {
    public static void quicksort(int arr[],int si , int ei){
        // base condition
        if(si>=ei){
            return;
        }
        //takimg pivot lst element
        int pidx =partition(arr,si,ei);
        quicksort(arr, si, pidx-1); // left part
        quicksort(arr, pidx+1, ei); // right part
    }

    public static int partition(int arr[], int si,int ei){
        int pivot= arr[ei];
        int i = si-1; // to make space for elemnet smaller than pivot
        for(int j=0;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
                //swap pivot
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;

    }
        // Print the array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,4,2,6,9,8};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
}
 // averagetime complexity O(nlogn)
 // worst time complexity O(n^2)
 // space complexity O(1)
