package week2;

import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printRectangle(sc);
                    break;
                case 2:
                    printSquareTriangleMenu(sc);
                    break;
                case 3:
                    printIsoscelesTriangle(sc);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
            System.out.println();
        } while (choice != 4);

        sc.close();
    }

    private static void printRectangle(Scanner sc) {
        System.out.print("Enter rectangle height: ");
        int height = sc.nextInt();
        System.out.print("Enter rectangle width: ");
        int width = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printSquareTriangleMenu(Scanner sc) {
        System.out.println("Square triangle corners:");
        System.out.println("1. Bottom-left");
        System.out.println("2. Bottom-right");
        System.out.println("3. Top-left");
        System.out.println("4. Top-right");
        System.out.print("Choose corner: ");
        int corner = sc.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();

        switch (corner) {
            case 1:
                printBottomLeftTriangle(height);
                break;
            case 2:
                printBottomRightTriangle(height);
                break;
            case 3:
                printTopLeftTriangle(height);
                break;
            case 4:
                printTopRightTriangle(height);
                break;
            default:
                System.out.println("Invalid corner choice.");
        }
    }

    private static void printBottomLeftTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printBottomRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            // In dấu cách
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            // In dấu *
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTopLeftTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTopRightTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            // In dấu cách
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            // In dấu *
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printIsoscelesTriangle(Scanner sc) {
        System.out.print("Enter the height of the isosceles triangle: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            // In dấu cách để căn giữa
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // In dấu *
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
