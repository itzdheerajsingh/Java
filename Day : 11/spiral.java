public class spiral {
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int Endrow=matrix.length-1;
        int Endcol=matrix[0].length-1;

        while(startrow<=Endrow && startcol<=Endcol){

            //Top
            for(int j=startcol;j<=Endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=Endrow;i++){
                System.out.print(matrix[i][Endcol]+" ");
            }
            //bottom
            for(int j=Endcol-1;j>=startcol;j--){
                System.out.print(matrix[Endrow][j]+" ");
                if(startrow==Endrow){
                    break;
                }
            }
            //left
            for(int i=Endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcol]+" ");
                if(startcol==Endcol){
                    break;
                
            }
            }
            startrow++;
            startcol++;
            Endrow--;
            Endcol--;


        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4,},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printspiral(matrix);
    }
}


