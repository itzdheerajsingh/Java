public class powerofn {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int npm1=power(x, n-1);
        int npm=x*npm1;
        return npm;
        //return x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
