import java.util.*;
public class factorialeg {
    public static int multiply(int n){
        int f = 1;
        for(int i=1; i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter a number to find factorial : ");
        int n = sc.nextInt();
        System.out.println( multiply(n));
        sc.close();
    }
}
