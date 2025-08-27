import java.util.*;
public class type_conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float num = sc.nextInt();         // implicit type casting int to float
        System.out.println(num);

        // int num = sc.nextFloat();         this is not possible float is larger data type than int
        // System.out.println(num);

        sc.close();
    }
}


     /*   implicit type casting is from low to higher data type to higher data type
     byte- short - int - long - float - double      */

    // explicit type casting is from higher to lower data type