//using prefix sum (O(n²))

public class largestsubarraysum2 {

  public static void largestsum(int arr[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE; 
    int prefix[]= new int[arr.length];
    prefix[0]=arr[0];

    //calculate prefix array -> sum till last previous index i.e. {1,3,6,10,15}
    for(int i=1;i<arr.length;i++){
        prefix[i]=prefix[i-1]; 
    }

    // 1. Loop for starting point
    for(int i=0;i<arr.length;i++){       

        // 2. Loop for ending point
        for(int j=i;j<=arr.length;j++){ 

            currsum=0;   // reset currsum for new subarray
            currsum= i==0? prefix[j]:prefix[j]-prefix[i-1];

           

            // Print sum of this subarray
            System.out.println(currsum);   

            // 4. Update maxsum if current sum is larger
            if(maxsum<currsum){    
                maxsum=currsum;     
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
    

