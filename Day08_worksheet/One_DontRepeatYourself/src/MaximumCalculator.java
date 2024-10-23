public class MaximumCalculator {
    public int getMax(int n, int m) {
        if (n > m) {
            return n;
        } else {
            return m;
        }
    }
    public Object[] getMax(Object[] o1, Object[] o2) {
        if (o1.length > o2.length) {
            return o1;
        } else {
            return o2;
        }
    }
    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        if (n1 > n2) {
            return number1;
        } else {
            return number2;
        }
    }
}
