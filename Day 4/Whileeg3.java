import java.util.*;
public class Whileeg3 {
    public static void  main (String args[]){
       
        System.out.println("enter nunmber till which you want to print sum");
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();

         int i= 1;
         int sum =0;
        while(i<=n){
            
            sum+=i;
            i++;
        }
        System.out.println("sum is : " + sum);
        sc.close();

    }
    
}
