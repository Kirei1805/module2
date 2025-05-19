package week3;

import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Enter col: ");
        int cols = Integer.parseInt(sc.nextLine());
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter matrix element at:"+i+","+j+":");
                matrix[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        double max = matrix[0][0];
        int row = 0;
        int col = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Max Matrix Element: " + max);
        System.out.println("Row Index: " + row + ", Col Index: " + col);
    }

}
