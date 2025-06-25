package week7;

import java.util.Scanner;

public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập tên lớp (hoặc gõ 'exit' để thoát): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thoát chương trình.");
                break;
            }

            if (isValidClassName(input)) {
                System.out.println(" Tên lớp hợp lệ.");
            } else {
                System.out.println(" Tên lớp không hợp lệ.");
            }
        }
    }
}
