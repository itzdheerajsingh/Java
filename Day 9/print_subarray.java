public class print_subarray{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){//starting point
            for(int j=i;j<=arr.length;j++){//ending point
                //print subarray
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

        public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        printarr(arr);
        
    }
}
// time complexity is O(n^3)
// space complexity is O(1)
