import java.util.*;
public class if_else{
public static void  main(String args[]){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter age of person");
    int age = sc.nextInt();

    if (age>=18){
        System.out.println("adult");
    }
    else {
        System.out.println("not adult");
    }
   
 sc.close();
}
}