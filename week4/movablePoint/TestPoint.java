package week4.movablePoint;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Default Point: " + p1);

        Point p2 = new Point(4.5f, 6.7f);
        System.out.println("Point with params: " + p2);

        p2.setX(8.9f);
        p2.setY(9.1f);
        System.out.println("After setX and setY: " + p2);

        p2.setXY(1.2f, 3.4f);
        System.out.println("After setXY: " + p2);

    }
}
