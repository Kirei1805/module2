package week3;

import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,4,6,7,8,0};
        int n = arr.length;
        System.out.println("Mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Nhap phan tu can them: ");
        int X = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vi tri index can them vao" + "( tu 0 den "+ (n-1)+ " )");
        int  index = Integer.parseInt(sc.nextLine());
        if (index<0 || index>=n){
            System.out.println("Khong the tim ra vi tri can them");
        } else {
            for( int i = n-1; i>index; i--){
                arr[i] = arr[i-1];
            }
            arr[index] = X;
            System.out.println("Mang sau khi them phan tu: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
