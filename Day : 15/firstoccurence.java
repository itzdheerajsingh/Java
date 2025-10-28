public class firstoccurence {

    public static boolean occurence(int arr[],int key,int i){
        if(i==arr.length-1){
            return false;
        }
        if(arr[i]==key){
            System.out.println("First occurence of key is at index "+i);
            return true;
        }
        return occurence (arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,3,2,8,6,5,9,7};
        int key=6;
        System.out.println(occurence(arr,key,0));
    }
}
