package week3;

import java.util.Scanner;

public class MinMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Enter cols: ");
        int cols = Integer.parseInt(sc.nextLine());
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter matrix element at:"+i+","+j+":");
                matrix[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        double min = matrix[0][0];
        int row = 0;
        int col = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(min > matrix[i][j]) {
                    min = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Max Matrix Element: " + min);
        System.out.println("Row Index: " + row + ", Col Index: " + col);
    }

}
