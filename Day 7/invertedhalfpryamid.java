//inverted half pryamid
public class invertedhalfpryamid {

    public static void pattern( int rows ){
        //outer loop for rows
        for(int i=1;i<=rows;i++){ 
              //inner loop for print space
              for(int j=1;j<=rows-i;j++){   
                  System.out.print(" "); 
              }
              //inner loop for stars
              for(int j=1;j<=i;j++){
              System.out.print("*");
        }
        System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}
