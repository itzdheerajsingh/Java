public class diagonalsum1 {
    public static int printsum(int arr[][]){
        int sum=0;
        // Primary diagonal
        for(int i=0;i<arr.length;i++){
            // Secondary diagonal
            for(int j=0;j<arr[0].length;j++){

            if(i==j){
                //sum=sum + arr[i][j];  /* This will add value of element element i=j to sum  */
                sum+=arr[i][j];     
             }
            // sum of element that has i+j sum equal to the 4-1 i.e. 3 for this example
            else if(i+j==arr.length-1){ 
                sum+=arr[i][j];
            }
        }
    }
    return sum;
}
    
    public static void main(String args[]){

        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print("Diagonal sum is : ");
        System.out.println(printsum(arr));
    }
}
// O(n^2)