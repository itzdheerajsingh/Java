import java.util.*;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int n = maze.length;
        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];

        if (maze[0][0] == 1)  // start should be open
            solveMaze(maze, n, 0, 0, "", visited, paths);

        System.out.println("All possible paths:");
        for (String path : paths) {
            System.out.println(path);
        }
    }

    // Recursive backtracking function
    public static void solveMaze(int[][] maze, int n, int row, int col, String path,
                                 boolean[][] visited, List<String> paths) {
        // Base case: destination reached
        if (row == n - 1 && col == n - 1) {
            paths.add(path);
            return;
        }

        // Direction arrays
        int[] dRow = {1, 0, 0, -1};
        int[] dCol = {0, -1, 1, 0};
        char[] move = {'D', 'L', 'R', 'U'};

        // Mark current cell visited
        visited[row][col] = true;

        // Try all 4 directions
        for (int i = 0; i < 4; i++) {
            int newRow = row + dRow[i];
            int newCol = col + dCol[i];

            // Check validity
            if (isSafe(maze, n, newRow, newCol, visited)) {
                solveMaze(maze, n, newRow, newCol, path + move[i], visited, paths);
            }
        }

        // Backtrack
        visited[row][col] = false;
    }

    public static boolean isSafe(int[][] maze, int n, int row, int col, boolean[][] visited) {
        return (row >= 0 && row < n && col >= 0 && col < n && maze[row][col] == 1 && !visited[row][col]);
    }
}
