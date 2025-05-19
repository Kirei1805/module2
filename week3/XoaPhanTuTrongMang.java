package week3;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,4,6,7,8,6,0};
        int n = arr.length;
        System.out.print("Mang ban dau la : ");
        for(int number : arr ) {
            System.out.print(number + " ");}
        System.out.println();
        System.out.println("Nhap phan tu can xoa: ");
        int X = Integer.parseInt(sc.nextLine());
        int index_del = -1;
        for(int i = 0; i <n; i++) {
            if(arr[i] == X) {
                index_del = i;
            }
        }
        if(index_del == -1) {
            System.out.println("Khong co phan tu ban muon xoa");
        } else {
            System.out.println("Phan tu " + X + " o vi tri "+ index_del);
        }
        for( int i = index_del; i < n-1; i++){
            arr[i] = arr[i+1];
        } n--;
        System.out.println("mang sau khi xoa phan tu " + X);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
