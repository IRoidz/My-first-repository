public class Five {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.x = 10;
        point1.y = 20;

        Point point2 = new Point();
        point2.x = 30;
        point2.y = 40;

        Point point3 = new Point();
        point3.x = 90;
        point3.y = 80;

        double p1p2 = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
        double p1p3 = Math.sqrt(Math.pow(point1.x - point3.x, 2) + Math.pow(point1.y - point3.y, 2));
        double p2p3 = Math.sqrt(Math.pow(point2.x - point3.x, 2) + Math.pow(point2.y - point3.y, 2));

        if (p1p2 < p1p3 && p1p2 < p2p3) {
            System.out.println("Point 1 and Point 2 are closest with a distance of " + p1p2);
        } else if (p1p3 < p2p3) {
            System.out.println("Point 1 and Point 3 are closest with a distance of " + p1p3);
        } else {
            System.out.println("Point 2 and Point 3 are closest with a distance of " + p2p3);
        }
    }
}