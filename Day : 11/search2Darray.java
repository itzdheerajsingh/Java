import java.util.Scanner;
public class search2Darray {

    //to search element
    public static boolean search(int matrix[][], int key) {
        for(int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found a cell("+i+","+j+")");
                    return true;
                }
            }

        }
        System.out.println("Key not found");
        return false;
        
    }
    // to print array
    public static void print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    // to take input matrix 
    public static void main(String args[]){

        int matrix[][]=new int [3][3];
        int m=matrix.length,n=matrix[0].length;
        Scanner sc=new Scanner (System.in);

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        print(matrix);

        // to take key as input
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        search(matrix, key);
        
        
    
    }
}
