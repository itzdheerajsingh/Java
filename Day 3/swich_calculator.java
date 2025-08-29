import java.util.*;
public class swich_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number");
        int second = sc.nextInt();

        System.out.println("Enter operation");
        char operator = sc.next().charAt(0);
         
        System.out.println("calculated value is ");
              switch(operator){
                     case '+' : System.out.println(first+second);
                                break;
                     case '-' : System.out.println(first-second);
                                break;
                     case '/' : System.out.println(first/second);
                                 break;
                     case '*' : System.out.println(first*second);
                                 break;
                     case '%' : System.out.println(first%second);
                                 break;
                      default : System.out.println("calulator is not fesiable with this operation");
            sc.close();
         } }
    
}
