public class Main {
    public static void main(String[] args) {
        Matrix arr = new Matrix(3, 3);
        String nums = "1,2,3;4,5,6;7,8,9";
        arr.setMatrix(nums);
        arr.prettyPrint();
    }
}