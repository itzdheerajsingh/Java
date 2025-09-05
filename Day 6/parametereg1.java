import java.util.*;
public class parametereg1 {
         
             public static void calculatesum(int n1 , int n2){  
             // here n1 and n2 are parameters that holds value of a and b     
             int sum = n1+n2;
             System.out.println("sum is : " + sum);
             //return ; it used when return type is not void
         
    }        public static void main(String args[]){
             Scanner sc= new Scanner (System.in);
             int a = sc.nextInt();
             int b = sc.nextInt();
             calculatesum(a,b); // function call
             sc.close();
    }
}
