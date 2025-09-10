public class largestsubarraysum{
    public static void largestsum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;            //-infinity
        for(int i=0;i<arr.length;i++){           //starting point
            for(int j=i;j<=arr.length;j++){      //ending point
                currsum=0;   
                for(int k =i; k<j ; k++){        //subarray
                                                 // System.out.print(arr[k]+" "); to print all subarrays
                    currsum += arr[k];           // currsum=currsum+arr[k];
                }   
                System.out.println(currsum);   
                if(maxsum<currsum){               //updating maxsum
                    maxsum=currsum;               //or maxsum=Math.max(maxsum,currsum);
                }   
            }
        }
        System.out.println("largest sum is: "+maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        largestsum(arr);
    }
}
                                                 // time complexity is O(n^3)
                                                 // space complexity is O(1)