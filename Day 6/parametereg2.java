import java.util.*;
public class parametereg2 {
         
             public static int calculatesum(int n1 , int n2){           //parameters or formal parameters , written in fuction definition 
             int sum = n1+n2;
             return sum;
             //return ; it used when return type is not void
         
    }        public static void main(String args[]){
             Scanner sc= new Scanner (System.in);
             int a = sc.nextInt();
             int b = sc.nextInt();
             int sum = calculatesum(a,b);   // arguments or actual parameters , written in function call
             System.out.println("sum is : " + sum);
             sc.close();
    }
}