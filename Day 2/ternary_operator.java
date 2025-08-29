import java.util .*;
public class ternary_operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        //ternary operator
        String type= ((num%2)==0)?"number is even" : "number is odd" ;  // x:y means if not x then y and this value will assign to type
        System.out.println(type);
        sc.close();
    }
}
