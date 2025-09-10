public class pairs_arrray{

    public static void pairs(int nums[]){
        int tp=0; // total pairs
        for( int i=0;i<nums.length;i++){
            int curr=nums[i];
            for (int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+ nums[j]+")");
                tp++;

            }
            System.out.println();
        }
        System.out.println("total pairs: "+tp);
        // or for total pairs we have formula-> tp= n(n-1)/2
        // int ttp = (nums.length*(nums.length-1))/2;
        // System.out.println("total pairs: "+ttp);
    }
    public static void main (String args[]){
        int nums[]={1,3,5,7,9};
        pairs(nums);
    }
    
}