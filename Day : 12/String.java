import java.util.*;
public class initializeString{
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'} ;
        String str1= "abcd";
        String str2 = new String("pqrs");

        // strings are immutable

        Scanner sc=new Scanner(System.in);
        String example; // create string of name example
        
        // example=sc.next(); // take input of first word in example string 
        example=sc.nextLine(); // take input of STRING in example string 
        System.out.println(example);
    }
}
