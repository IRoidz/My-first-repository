public class Main {

    static String[] split(String s, int n) {
        String[] arr = new String[(s.length() / n) + (s.length() % n == 0 ? 0 : 1)];

        for (int i = 0; i < arr.length; i++) {
            if ((i + n) + n >= s.length()) {
                arr[i] = s.substring(i * n, s.length());
                break;
            }
            arr[i] = s.substring(i * n, (i + 1) * n);
        }
        return arr;
    }

    public static void main(String[] args) {
        String test = "programming";

        String[] arr1 = split(test, 3);

        for (String s: arr1) {
            System.out.print(s + ", ");
        }
    }
}