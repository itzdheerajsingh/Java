public class largestnum {

public static int largest(int nums[]){
    int largest=Integer.MIN_VALUE; //-infinity
    for(int i=0;i<nums.length;i++){
        if(largest<nums[i]){
            largest=nums[i];
        }
        
    }
    return largest;
    }

public static void main(String args[]){
    int nums[]={1,2,3,4,5,6,7,8,9};
     System.out.println("largest number is " +largest(nums));
        }
}
