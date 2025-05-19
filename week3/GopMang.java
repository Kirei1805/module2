package week3;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Moi nhap so phan tu mang thu nhat: ");
        int arr1 = Integer.parseInt(sc.nextLine());
        int[] array1 = new int[arr1];

        System.out.print("Moi nhap so phan tu mang thu hai: ");
        int arr2 = Integer.parseInt(sc.nextLine());
        int[] array2 = new int[arr2];

        System.out.println("Nhap gia tri cho mang thu nhat:");
        for (int i = 1; i < arr1; i++) {
            System.out.print("array1[" + i + "]: ");
            array1[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Nhap gia tri cho mang thu hai:");
        for (int i = 1; i < arr2; i++) {
            System.out.print("array2[" + i + "]: ");
            array2[i] = Integer.parseInt(sc.nextLine());
        }

        int[] array3 = new int[arr1 + arr2];

        for (int i = 0; i < arr1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < arr2; i++) {
            array3[arr1 + i] = array2[i];
        }

        System.out.println("Mang sau khi gop:");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        sc.close();
    }
}
