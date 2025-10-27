public class Numdecrease{
    public static void Decrease(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n+" ");
            Decrease(n-1);
        }
    }
    public static void main(String args[]){
        int n=15;
        Decrease(n);
    }
}
// time complexity: O(n)
// space complexity: O(n) due to recursion stack
