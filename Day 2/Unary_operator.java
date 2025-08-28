public class Unary_operator {
    public static void main(String args[]){
        int a= 10;
        System.out.println(a);
        int b= ++a; // pre-increment , unary operator. means first increment the value of a by 1 and then assign it to b
        System.out.println(a);
        System.out.println(b);

        int c= 10;
        System.out.println(c);
        int d= c++; // post-increment means first assign the value of c to d and then decrement the value of c by 1
        System.out.println(c);
        System.out.println(d);
    }
    
}
