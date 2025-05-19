package week3;

import java.util.Scanner;

public class SumOfCols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of columns: ");
        int cols = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the value for row " + i + " and column " + j + ": ");
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Enter the column to sum (0 to " + (cols - 1) + "): ");
        int colSum = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][colSum];
        }

        System.out.println("The sum of column " + colSum + " is: " + sum);

        sc.close();
    }
}
