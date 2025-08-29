import java.util.*;
public class largestofthree {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);
       System.out.println("A is");
    int a= sc.nextInt();
       System.out.println("B is");
    int b= sc.nextInt();
       System.out.println("C is");
    int c= sc.nextInt();

    if(a>b && a>c){
        System.out.println("A is larger");
    }
     else if(b>=c){
        System.out.println("B is larger");
    }

     else{System.out.println("C is larger");}
       sc.close();
       
    }
 
}
