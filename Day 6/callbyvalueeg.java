public class callbyvalueeg {
 
    public static void swapvalue(int a , int b){  // a and b are parameters
        int temp = a;
        a = b;
        b = temp;
        
    }
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        swapvalue(a,b); // a and b are arguments
        System.out.println("value  of a is : " + a);
        System.out.println("value  of b is : " + b);
// here value of a and b will remain same because in call by value only value is passed not the reference means copy of value is passed not origional thats why value of a and b will remain same
    
    }
}

