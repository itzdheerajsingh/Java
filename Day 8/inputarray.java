import java.util.*;
public class inputarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter 5 elements in array:");
        arr[2]=arr[2]+5;

        //loop to take input in array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();    
        }

        //to update in array

        arr[2]=arr[2]+5;//to add 5 in element at index 2
        System.out.println("updated arr[2]= " + arr[2]);

        //to print length of array
      
        System.out.println("Length of array is: "+arr.length);
        }   
}
