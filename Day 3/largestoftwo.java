import java.util.*;
public class largestoftwo {
    public static void main(String args[]){
     Scanner sc = new Scanner (System.in) ;;

     System.out.println("enter numbere A =") ;
     int A= sc.nextInt();   // to taek input A

     System.out.println("enter numbere B =") ;
     int B= sc.nextInt(); // to take input B

     if(A>B){
     System.out.println("A is greater than B");}

     else{ 
        System.out.println("B is greater than A");
     }
     sc.close();
    }
    
}
