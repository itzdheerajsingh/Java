public class rhombus {
    public static void pattern(int n){
        //upper half
        for(int i=1;i<=n;i++){
            
            //spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //pattern
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
    
    }
    public static void main(String args[]){
        pattern(5);
    }
    
}
