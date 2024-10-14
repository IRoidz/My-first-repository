public class Main {

    static String[] split(String s, int n) {
        String[] arr = new String[s.length() / n + (s.length() % n == 0 ? 0 : 1)];

        if (s == null || s.length() == 0 || n < 0) return arr;

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) * n > s.length()) {
                arr[i] = s.substring(i * n);
                break;
            }
            arr[i] = s.substring(i * n, (i + 1) * n);
        }
        return arr;
    }

    public static void main(String[] args) {
        String s = "programming";

        String[] arr1 = split(s, 3);

        for (String string: arr1) {
            System.out.print(string + ", ");
        }
    }
}