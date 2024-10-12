public class Main {
    public static void main(String[] args) {
        ArrayChecker checker = new ArrayChecker();

        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = checker.reverse(arr2);

        if (checker.isSymmetrical(arr2)) {
            System.out.println("Symmetrical. Can't be reversed.");
        } else {
            System.out.print("Reversed: ");
            for (int i : arr3) {
                System.out.print(i + ", ");
            }
        }
    }
}