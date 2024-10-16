package pij.day6.measure;

public class MeasurableString implements Measurable {

    private String str;

    public MeasurableString(String str) {
        this.str = str;
    }
    public double getMeasure() {
        return this.str.length();
    }
}
