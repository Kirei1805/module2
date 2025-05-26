package week4.Point;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println("default p1: " + p1);
        Point3D p2 = new Point3D(10f,10f,10f);
        System.out.println("p1 have params: " + p2);
        p2.setX(11);
        p2.setY(11);
        p2.setZ(11);
        System.out.println("p1 after set X,Y,Z: " + p2);
        p2.setXYZ(12f,13f,14f);
        System.out.println("p1 after set XYZ: " + p2);

    }
}
