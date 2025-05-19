package week3;

import java.util.Scanner;

public class SumOfCrossLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the square matrix: ");
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the square matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element " + i + " "  + j );
                matrix[i][j]= Integer.parseInt(sc.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        System.out.println("The sum of the elements of the square matrix is: " + sum);
    }
}
