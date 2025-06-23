package week7;

import java.util.Scanner;

public class TriangleApp {

    static class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
            super(message);
        }
    }

    static class Triangle {
        private double a, b, c;

        public Triangle(double a, double b, double c) throws IllegalTriangleException {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Các cạnh tam giác phải lớn hơn 0.");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại.");
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getPerimeter() {
            return a + b + c;
        }

        public double getArea() {
            double s = getPerimeter() / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        @Override
        public String toString() {
            return "Tam giác có các cạnh: a=" + a + ", b=" + b + ", c=" + c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle);
            System.out.println("Chu vi: " + triangle.getPerimeter());
            System.out.println("Diện tích: " + triangle.getArea());

        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi nhập liệu! Vui lòng nhập số.");
        }

        scanner.close();
    }
}
