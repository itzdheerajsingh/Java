public class rowMajorSimulation {
    public static void main(String[] args) {
        int rows = 2, cols = 3;
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Create a 2D array
        int[][] matrix = new int[rows][cols];
        
        // Fill in column-major order manually
        int index = 0;
        for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
                matrix[row][col] = numbers[index++];
            }
        }
        

        // Print matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
