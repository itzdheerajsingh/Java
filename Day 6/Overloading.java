import java.util.*;
public class Overloading {
    //overloading means same function name with different parameters
    //method to add two numbers
    public static int add(int a, int b){
        return a + b;
    }
    //method to add three numbers
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 if want to add 2 numbers  ");
        System.out.println("Enter 2 if want to add 3 numbers  ");
        int inputnum = sc.nextInt();

        if(inputnum==1){
            System.out.println("enter first number");
            int a = sc.nextInt();
            System.out.println("enter second number");
            int b = sc.nextInt();
            System.out.println("sum of 2 numbers : " + add(a,b));
            
        }
        else if(inputnum==2){
            System.out.println("enter first number");
            int a = sc.nextInt();
            System.out.println("enter second number");
            int b = sc.nextInt();
            System.out.println("enter third number");
            int c = sc.nextInt();
            System.out.println("sum of 3 numbers : " + add(a,b,c));
        }
        else{
            System.out.println("Invalid input");
            return;
        
        }
        sc.close();
    }
}
