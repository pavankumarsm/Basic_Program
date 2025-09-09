public class Main {
    public static void main(String[] args) {
        int rows = 5; // number of rows
        int cols = 4; // number of columns

        int[][] matrix = new int[rows][cols];
        int num = 1;

        for (int c = 0; c < cols; c++) {
            if (c % 2 == 0) { // even column → top to bottom
                for (int r = 0; r < rows; r++) {
                    matrix[r][c] = num++;
                }
            } else { // odd column → bottom to top
                for (int r = rows - 1; r >= 0; r--) {
                    matrix[r][c] = num++;
                }
            }
        }

        // print matrix
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.printf("%3d", matrix[r][c]);
            }
            System.out.println();
        }
    }
}
