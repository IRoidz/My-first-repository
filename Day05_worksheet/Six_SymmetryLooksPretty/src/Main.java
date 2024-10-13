public class Main {
    public static void main(String[] args) {
        MatrixChecker checker = new MatrixChecker();
        int[][]arr = {
                {1, 0, 0},
                {1, 5, 0},
                {2, 3, 9}
        };


        System.out.println(checker.isTriangular(arr));

    }
}