public class binarysearch {
    public static int binarysearchn(int arr[],int target){
        int start=0,end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){//target founnd
                return mid;}
            else if(target<arr[mid]){//left search
                end=mid-1;
            }
            else{
                start=mid+1;//right search
            }
        }
        return -1;//target not found
    }
 public static void main(String args[]){
    int arr[]={2,4,6,8,10,12,14,16,18};
    int target=18;
    int result=binarysearchn(arr,target);
    System.out.println("target found at index: "+result);
 }   
}
