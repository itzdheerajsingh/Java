public class Numincrease {
    public static void Increase(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        else{
            Increase(n-1);
            System.out.print(" "+n);
        }
    }
    public static void main(String args[]){
        int n=15;
        Increase(n);
    }
}
// time complexity: O(n)
// space complexity: O(n) due to recursion stack