package week5.palindromeChecker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "Able was I ere I saw Elba";
        if (isPalindrome(test)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }
}

