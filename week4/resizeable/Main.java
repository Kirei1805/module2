package week4.resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes ={
                new Circle(5),
                new Square(5),
                new Rectangle(4,6)
        };
        Random rand = new Random();

        for (Resizeable shape : shapes) {
            double percent = 1 + rand.nextInt(100);

            System.out.println("Before resize:");
            printArea(shape);

            shape.resize(percent);

            System.out.printf("After resize by %.2f%%:\n", percent);
            printArea(shape);

            System.out.println("------------------------");
        }
    }

    private static void printArea(Resizeable shape) {
        if (shape instanceof Circle) {
            System.out.printf("Circle area: %.2f\n", ((Circle) shape).getArea());
        } else if (shape instanceof Rectangle) {
            System.out.printf("Rectangle area: %.2f\n", ((Rectangle) shape).getArea());
        }
    }
}
