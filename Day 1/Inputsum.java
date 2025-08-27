import java.util.*;
public class Inputsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("sum ="+ sum);

        sc.close(); // closing the scanner object i.e. sc without this it will give resource leak warning in yellow colour12
    }
    
}
