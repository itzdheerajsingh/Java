public class selection_sort {

    public static void selection_sorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
                    
            }
            //swapping
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

    }
   public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();   
    }
    public static void main(String args[]){
        int arr[]={1,3,5,6,4};
        selection_sorting(arr);
        printarray(arr);
    }
}
