package week4.Test;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Circle circle2 = new Circle(2.5,"blue");
        System.out.println(circle2.toString());
        circle2.setRadius(3.5);
        circle2.setColor("red");
        System.out.println(circle2.toString());
    }
}
