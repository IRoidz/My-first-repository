public class Main {
    public static void main(String[] args) {
        Matrix arr = new Matrix(3, 3);

        arr.setElement(0, 2, 10);
        arr.setRow(1, "23,15,9");
        arr.setColumn(2, "12,4,19");

        System.out.println(arr);
        System.out.println();
        arr.prettyPrint();

    }
}