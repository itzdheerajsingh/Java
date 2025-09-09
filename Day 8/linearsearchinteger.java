 public class linearsearchinteger {

    public static int search (int nums[], int key){
        for ( int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }    
        }
        return -1;
    }
   public static void main(String args[]){
    int nums[]={1,2,3,4,5,6,7,8,9};
    int key=9;
    int index=search(nums,key);
            if(index== -1){
                System.out.println("key found not found index ");
            }
                
            else{
                System.out.println("key is at index "+index);
            }
   } 
}

