import java.util.*;
public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int Product = a*b;
        System.out.println("Product ="+ Product);

        sc.close(); // closing the scanner object i.e. sc without this it will give resource leak warning in yellow colour12
    }
    
}

