package week6;

import java.util.Scanner;

public class LongestSortedSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String maxSub = "";
        String current = "";

        for (int i = 0; i < input.length(); i++) {
            if (current.isEmpty() || input.charAt(i) >= current.charAt(current.length() - 1)) {
                current += input.charAt(i);
            } else {
                if (current.length() > maxSub.length()) {
                    maxSub = current;
                }
                current = "" + input.charAt(i);
            }
        }

        // Check once more after loop
        if (current.length() > maxSub.length()) {
            maxSub = current;
        }

        System.out.println(maxSub);
    }
}
