public class Main_65 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (rows <= 0 || cols <= 0 || str == null || matrix == null)
            return false;


        boolean[] visited = new boolean[matrix.length];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(findPath(matrix, i, j, rows, cols, str, 0, visited))
                    return true;
            }
        }
        return false;
    }

    public boolean findPath(char[] matrix, int row, int col, int rows, int cols,
                            char[] str, int index, boolean[] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || str[index] != matrix[row * cols + col]
                || visited[row * cols + col])
            return false;

        if (index == str.length - 1)
            return true;
        visited[row * cols + col] = true;
        if (findPath(matrix, row + 1, col, rows, cols, str, index + 1, visited)
                || findPath(matrix, row - 1, col, rows, cols, str, index + 1, visited)
                || findPath(matrix, row, col + 1, rows, cols, str, index + 1, visited)
                || findPath(matrix, row, col - 1, rows, cols, str, index + 1, visited)) {
            return true;
        }
        visited[row * cols + col] = false;
        return false;
    }
}
