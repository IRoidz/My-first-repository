public class MaximumCalculator {
    public int getMax(int n, int m) {
        return getMaxHelper(n, m, n, m);
        /*
        if (n > m) {
            return n;
        } else {
            return m;
        }
         */
    }
    public Object[] getMax(Object[] o1, Object[] o2) {
        return getMaxHelper(o1, o2, o1.length, o2.length);
        /*
        if (o1.length > o2.length) {
            return o1;
        } else {
            return o2;
        }
         */
    }
    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        return getMaxHelper(number1, number2, n1, n2);
        /*
        if (n1 > n2) {
            return number1;
        } else {
            return number2;
        }
         */
    }

    private <T> T getMaxHelper(T t1, T t2, int x1, int x2) {
        if (x1 > x2) {
            return t1;
        } else {
            return t2;
        }
    }
}
