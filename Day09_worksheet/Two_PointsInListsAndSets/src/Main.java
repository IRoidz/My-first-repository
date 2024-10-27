import java.util.*;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        System.out.println("p1.equals(p2): expected true; actual " + p1.equals(p2));
        List<Point> list = new ArrayList<>();
        list.add(p1);
        System.out.println("list.contains(p2): expected true; actual " + list.contains(p2));

        Set<Point> set1 = new LinkedHashSet<>();
        set1.add(p1);
        System.out.println("set1.contains(p2): expected true; actual "
                + set1.contains(p2));

        Set<Point> set2 = new TreeSet<>();
        set2.add(p1);
        System.out.println("set2.contains(p2): expected true; actual "
                + set2.contains(p2));

    }
}