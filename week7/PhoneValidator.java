package week7;

import java.util.Scanner;

public class PhoneValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số điện thoại (hoặc 'exit' để thoát): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thoát chương trình.");
                break;
            }

            if (isValidPhoneNumber(input)) {
                System.out.println(" Số điện thoại hợp lệ.");
            } else {
                System.out.println(" Số điện thoại không hợp lệ.");
            }
        }
    }
}
