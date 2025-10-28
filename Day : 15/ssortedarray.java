public class ssortedarray {
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            System.out.println("Array is not sorted at index "+i);
            return false;
        }
        else{
            return issorted(arr,i+1);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,5}; // arr.length=5
        System.out.println(issorted(arr,0)); // i=0
    }
}
