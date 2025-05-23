package week4.accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        System.out.println("Cricle 1 radius :"+ c1.getRadius() );
        System.out.println("Cricle 1 area : "+ c1.getArea() );
        System.out.println("Circle 2 radius :"+ c2.getRadius() );
        System.out.println("Circle 2 area : "+ c2.getArea() );;
    }
}
