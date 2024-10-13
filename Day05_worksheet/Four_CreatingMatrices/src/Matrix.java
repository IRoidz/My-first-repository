public class Matrix {
    private int[][] matrix;

    Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }
    public int[][] setElement(int row, int col, int value) {
        if (row <= matrix[0].length || col <= matrix.length - 1) {
            matrix[row][col] = value;
        }
        return matrix;
    }
    public int[][] setRow(int row, String nums) {
        String[] rowNums = nums.split(",");
        //check to see if int given is valid as well as valid string of nums
        if (row < matrix[0].length && rowNums.length == matrix.length ) {
            for (int i = 0; i < rowNums.length; i++) {
                matrix[row][i] = Integer.parseInt(rowNums[i]);
            }
        }
        return matrix;
    }
    public int[][] setColumn(int col, String nums) {
        String[] colNums = nums.split(",");
        if (col < matrix.length && colNums.length == matrix.length ) {
            for (int i = 0; i < colNums.length; i++) {
                matrix[i][col] = Integer.parseInt(colNums[i]);
            }
        }
        return matrix;
    }
    public String toString() {
        String values = "[";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                values += matrix[i][j];
                if (j < matrix[i].length - 1) {
                    values += ",";
                }
            }
            if (i < matrix.length - 1) {
                values += ";";
            }
        }
        values += "]";
        return values;
    }
    public void prettyPrint() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


