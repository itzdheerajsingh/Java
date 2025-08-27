import java.util.*;              //import all classes of java.util package
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

         String input1 = sc.next();
         System.out.println(input1);           // prints the first input word
         sc.nextLine();                        // to consume the newline character after next()

         String input2 = sc.nextLine();       // to take string input with spaces
         System.out.println(input2); 
         sc.next();                           // to consume the newline character after nextLine()

         float input3 = sc.nextFloat();       // to take float input
         System.out.println(input3); 

         int input4 = sc.nextInt();          // to take integer input
         System.out.println(input4); 

         byte input5 = sc.nextByte();        // to take byte input
         System.out.println(input5); 

         boolean input6 = sc.nextBoolean();  // to take boolean input i.e. true or false
         System.out.println(input6); 

         Double input7 = sc.nextDouble();    // to take double input
         System.out.println(input7);
         
         short input8 = sc.nextShort();      // to take short input
         System.out.println(input8);

         long input9 = sc.nextLong();        // to take long input
         System.out.println(input9);

         sc.close();                        // closing the scanner object i.e. sc
    }
}
