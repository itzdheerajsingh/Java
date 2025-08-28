public class assignment_operator {
    public static void main(String args[]){
        int a=10;
        int b=20;
        // Assignment Operators
        System.out.println("a = " + (a = 5)); 
        System.out.println("b += 5 = " + ( b += 5));         // b = b + 5
        System.out.println("a -= 5 = " + (a -= 5)); 
        System.out.println("b *= 5 = " + ( b *= 5)); 
        System.out.println("b /= 5 = " + ( b /= 5)); 
        System.out.println("b %= 5 = " + ( b %= 5)); 
    }
}
