public class butterfly {
    public static void pattern(int n){
        //upper half
        for(int i=1;i<=n;i++){
            //1st pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //inverted upper half
        for(int i=n;i>=1;i--){
            //1st pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(4);
    }
    
}
