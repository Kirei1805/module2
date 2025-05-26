package week4.Point;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p = new Point2D();
        System.out.println("Default Point: " + p);
        Point2D p2 = new Point2D(3.5f, 4.5f);
        System.out.println("Point with params: " + p2);

        p2.setX(5.5f);
        p2.setY(6.5f);
        System.out.println("Point after set X and Y: " + p2);
        p2.setXY(6f, 7.5f);
        System.out.println("Point after setXY: " + p2);
    }
}
