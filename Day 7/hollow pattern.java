//(5,4) hollow pryamid
public class pryamid{
    public static void pattern(int rows , int columns){
       //outer loop for rows
        for(int i=1;i<=rows;i++){
            //inner loop for colomns
            for(int j=1;j<=columns;j++ ){
                //print star
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");}
            }
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        pattern(4,5);   
        System.out.println();
        
    }
}
