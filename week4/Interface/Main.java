package week4.Interface;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        for (Shape shape : shapes) {
            System.out.printf("Area: %.2f\n", shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("----------------------");
        }
    }
}

