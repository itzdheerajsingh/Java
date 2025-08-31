import java.util.*;
public class continueeg2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your number : ");
            int n = sc.nextInt();

            if(n==10 || n==50){
                continue;
            }
            System.out.println("your number is acceptable " + n);
        }while(true);   
        // sc.close(); --- IGNORE ---
        
    }
}
