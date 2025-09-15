public class insertion_sort {

    public static void insertion(int nums[]){
        for(int i=0;i<nums.length;i++){
             int curr =nums[i];
            int previous = i-1;
    
            //find correct positon to insert ith element
            while(previous>=0 && nums[previous]>curr){
                 nums[previous+1]=nums[previous];
                 previous--;
            }
            //insert current element
            nums[previous+1]=nums[curr];
        }
        

    }
     public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();   
    }
    public static void main(String args[]){
        int nums[]={5,3,1,2,4};
        insertion(nums);
        printarray(nums);
    }

}
