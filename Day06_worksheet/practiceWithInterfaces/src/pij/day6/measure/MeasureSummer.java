package pij.day6.measure;

public class MeasureSummer {



    public static double sumMeasures(Measurable[] measurable) {
        double sum = 0.0;
        if (measurable == null) {
            System.out.println("Error");
            return sum;
        }
        for (Measurable m : measurable) {
            if (m != null) {
                sum += m.getMeasure();
            }
        }
        return sum;
    }
}
