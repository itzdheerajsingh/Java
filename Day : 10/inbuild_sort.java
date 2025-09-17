import java.util.Arrays;
public class inbuild_sort {

     // Method to print array elements
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     //Inbuild sort
    public static void main(String args[]){
        int arr[]={1,5,3,7,2};
        
        // Arrays.sort(arr);  // sort whole array
        // printArr(arr);

        Arrays.sort(arr,0,3);  // sort index 0 to 2
        printArr(arr);
    
    }
    
}

