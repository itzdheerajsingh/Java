public class swap {


    public static void swapvalue(int a , int b){  // a and b are parameters
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value  of a is : " + a);
        System.out.println("value  of b is : " + b);
        
    }
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        swapvalue(a,b); // a and b are arguments
        
    }
}

