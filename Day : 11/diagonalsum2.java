public class diagonalsum2 {
    public static void printdigonsum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            if (i != n - 1 - i) {  // avoid double-counting the middle element i.e. i=j
                sum += matrix[i][n - 1 - i]; // as i+j= n-1 therefore j = n-1-i
            }
        }

        System.out.println("Diagonal sum = " + sum);
    }

    // public static void print(int matrix[][]) {
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printdigonsum(matrix);
        // print(matrix);
    }
}

//O(n)
