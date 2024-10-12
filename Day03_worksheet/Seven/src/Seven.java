public class Seven {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.upLeft = new Point();
        rect1.downRight = new Point();

        rect1.upLeft.x = 30;
        rect1.upLeft.y = 20;
        rect1.downRight.x = 40;
        rect1.downRight.y = 10;

        int x = 35;
        int y = 15;

        if ((x >= rect1.upLeft.x && x <= rect1.downRight.x) && y <= rect1.upLeft.y && y >= rect1.downRight.y) {
            System.out.println("The point falls inside the rectangle");
        } else {
            System.out.println("The point falls outside the rectangle");
        }
    }
}