public class type_promotion {
    public static void main (String args[]){
        char a='a';
        char b='b';
        System.out.println(a+b); //it is type promotion condiition i.e. first a and b will be promoted to int and then addition will be done
    
        System.out.println((int)a); // implicit type promotion from char to int , done just to check ascii value of a
        System.out.println((int)b);
    }
}
