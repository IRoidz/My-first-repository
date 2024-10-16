package pij.day6.runner;

import pij.day6.measure.Measurable;
import pij.day6.measure.MeasurableString;
import pij.day6.measure.MeasureSummer;
import pij.day6.measure.Point;

public class MeasureSummerRunner {

    public static void main(String[] args) {
        Measurable[] measurableArray = {new Point(3, 4), null, new MeasurableString("String")};
//        measurableArray1[0] = new Point(3,4);
//        measurableArray1[1] = new Point(5,6);
//        measurableArray1[2] = null;
//        measurableArray1[3] = new MeasurableString("This is a string");
//        measurableArray1[4] = new MeasurableString("dog");
//        measurableArray = {new Point(3, 4), null, new MeasurableString("String")}

        System.out.println(MeasureSummer.sumMeasures(measurableArray));

    }
}
