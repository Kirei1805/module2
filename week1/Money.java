package week1;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 25000;
        double usd;
        System.out.println("Moi banj nhap so usd can doi sang vnd: ");
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        double result = usd * vnd;
        System.out.println(result);
    }
}
