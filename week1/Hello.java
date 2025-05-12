package week1;

import java.util.Scanner;

public class Hello {
    static public void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("week1.Hello " + name);
    }
}
