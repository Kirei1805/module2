package week4.Test;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());
        Cylinder cylinder2 = new Cylinder(2.0,"red",5.0);
        System.out.println(cylinder2.toString());
        cylinder2.setRadius(5.0);
        cylinder2.setHeight(7.0);
        cylinder2.setColor("white");
        System.out.println(cylinder2.toString());
    }
}
