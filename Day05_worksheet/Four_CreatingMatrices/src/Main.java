public class Main {
    public static void main(String[] args) {

        int[][] test = new int[3][3];
        test[2][0] = 1;
        test[1][0] = 23;
        test[0][0] = 1;

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j]+"\t");
            }
            System.out.println();
        }


    }
}