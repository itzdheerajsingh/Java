public class Checkpoweroftwo {
    public static boolean check(int n){
        //return true if n is a power of two
       return (n& (n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(check(16));
    }
}
