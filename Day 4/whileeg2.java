import java.util.*;
public class whileeg2 {
    public static void main(String args[]){
       int counter = 1;
       System.out.println("till which number you want to print");
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       while(counter<=n){
        System.out.print(counter+" ");
        counter++;
       }
       sc.close();
    }
}

