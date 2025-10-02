public class stringcharat {
//  To print whole string
    public static void stringprint(String first){
        for(int i=0;i<first.length();i++){
            System.out.print(first.charAt(i)+" ");
        }
    }
    public static void main (String args[]){
        String first="Dheeraj";
        String second="singh";
        System.out.println(second.charAt(0)); // to print specific index element
        stringprint(first);
    }
}
