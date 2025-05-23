package week3.quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the second number: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the third number: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has 2 roots:  " + equation.getRoot() + " and " + equation.getRoot2());
        } if (delta == 0) {
            System.out.println("the equation has 1 roots:  " + equation.getRoot());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
