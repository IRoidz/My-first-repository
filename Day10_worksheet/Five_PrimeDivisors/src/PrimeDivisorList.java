import java.util.ArrayList;
import java.util.List;


public class PrimeDivisorList extends Exception{
    private List<Integer> prime = new ArrayList<Integer>();

    public void add(Integer num) {
        if (num == null) {
            throw new NullPointerException();
        }
        if (!isPrime(num)) {
            throw new IllegalArgumentException();
        }
    }

    public void remove(Integer num) {
        prime.remove(num);
    }

    @Override
    public String toString() {

    }

    private boolean isPrime(int number) {
        if (number < 2)  {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
