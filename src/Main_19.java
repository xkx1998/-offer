import java.util.ArrayList;
import java.util.List;

public class Main_19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int left_y = 0, right_y = matrix[0].length - 1, top_x = 0, boom_x = matrix.length - 1;

        while ((right_y > left_y) && (boom_x > top_x)) {
            for (int i = left_y; i <= right_y; i++) {
                list.add(matrix[top_x][i]);
            }

            for (int i = top_x + 1; i <= boom_x; i++) {
                list.add(matrix[i][right_y]);
            }

            for (int i = right_y - 1; i >= left_y; i--) {
                list.add(matrix[boom_x][i]);
            }

            for (int i = boom_x - 1; i > top_x; i--) {
                list.add(matrix[i][left_y]);
            }
            left_y++;
            right_y--;
            top_x++;
            boom_x--;
        }

        if ((right_y == left_y) && (top_x == boom_x)) {
            list.add(matrix[top_x][left_y]);
        }

        if ((right_y == left_y) && (top_x < boom_x)) {
            for (int i = top_x; i <= boom_x; i++) {
                list.add(matrix[i][left_y]);
            }
        }

        if ((top_x == boom_x) && (left_y < right_y)) {
            for (int i = left_y; i <= right_y; i++) {
                list.add(matrix[top_x][i]);
            }
        }
        return list;
    }
}
