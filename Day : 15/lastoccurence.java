public class lastoccurence {
    public static int occurence(int arr[],int key,int i){
        // Base case
        if(i==arr.length){                      // If we reach the end of the array
            return -1;
        }
        // Recursive call
        int isfound= occurence(arr,key,i+1);    // Check in the rest of the array
        if (isfound==-1&&arr[i]==key) {         // If not found in the rest and current element matches key
             return i;                          // Return current index
        }
    
        return isfound;                         // Return the index found in the rest of the array
    }
    public static void main(String args[]){
        int arr[]={1,3,2,8,6,5,9,5,7};
        int key=5;
        System.out.println(occurence(arr,key,0));
    }

}
