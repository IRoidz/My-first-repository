public class Eight {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.upLeft = new Point();
        rect1.downRight = new Point();
        rect1.upLeft.x = 30;
        rect1.upLeft.y = 20;
        rect1.downRight.x = 40;
        rect1.downRight.y = 10;

        Rectangle rect2 = new Rectangle();
        rect2.upLeft = new Point();
        rect2.downRight = new Point();
        rect2.upLeft.x = 70;
        rect2.upLeft.y = 40;
        rect2.downRight.x = 120;
        rect2.downRight.y = 10;

        int x = 35;
        int y = 15;

        boolean condition1 = ((x >= rect1.upLeft.x && x <= rect1.downRight.x) && (y <= rect1.upLeft.y && y >= rect1.downRight.y));
        boolean condition2 = ((x >= rect2.upLeft.x && x <= rect2.downRight.x) && (y <= rect2.upLeft.y && y >= rect2.downRight.y));


        if (condition1 && condition2) {
            System.out.println("The point falls inside the rectangle");
        } else if (condition1) {
            System.out.println("The point falls inside the rectangle 1");
        } else if (condition2) {
            System.out.println("The point falls inside the rectangle 2");
        } else {
            System.out.println("The point falls outside both rectangles.");
        }

    }
}