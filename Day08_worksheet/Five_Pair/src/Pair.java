public class Pair {
    private Object one;
    private Object two;

    public Pair(Object one, Object two) {
        this.one = one;
        this.two = two;
    }

    public Pair(Object one) {
        this(one, one);
    }

    public Object getOne() {
        return one;
    }

    public Object getTwo() {
        return two;
    }

    public Pair swap() {
        Pair swapped = new Pair(this.getTwo(), this.getOne());
        return swapped;
    }

}
