import java.util.*;
public class checkevenorodd {
    public static void evenorodd(int n){
        if((n&1)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        evenorodd(n);
        sc.close();
    }
}
// time complexity is O(1) and space complexity is O(1)
/* 
logic behind this is that in binary representation of even number LSB is always 0 and for odd number it is always 1
so when we do bitwise AND of any number with 1 it will give 0 for even number and 1 for odd number
*/
// we can also use n%2==0 for even and n%2!=0 for odd but that will take more time as it involves division operation .complexity of this is O(log n) and space complexity is O(1)