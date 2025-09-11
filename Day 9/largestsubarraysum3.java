//kadanes algorithm
public class largestsubarraysum3 {

    public static void kadanes(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs = cs +arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);

        }
        System.out.println("our max array sum is " + ms);

    }
    public static void main(String[] args) {
        int arr[]= {-8,-5,7,8,5,-8,12};
        kadanes(arr);
    }
    
}
