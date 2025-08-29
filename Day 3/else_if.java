import java.util.*;
public class else_if{
public static void  main(String args[]){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter age of person");
    int age = sc.nextInt();

    if (age>=0 && age<=12){
        System.out.println("child");
    }
    else if(age>=13 && age<= 18) {
        System.out.println("teenager");
    }
   else {
    System.out.println("adult");
   }
   
 sc.close();
}
}
