import java.util.*;
public class Check_even{
    public static void main(String args[]){
     Scanner sc = new Scanner (System.in) ;;

     System.out.println("enter numbere =") ;
     int num= sc.nextInt();   // to take input A


     if(num%2==0){
     System.out.println("number is even");}

     else{ 
        System.out.println("number is odd");
     }
     sc.close();
    }
    
}
