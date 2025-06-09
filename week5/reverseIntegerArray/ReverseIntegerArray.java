package week5.reverseIntegerArray;

import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();

        // Push tất cả phần tử vào Stack
        for (int number : numbers) {
            stack.push(number);
        }

        // Lấy ngược lại từ Stack để đảo mảng
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }

        // In kết quả
        System.out.print("Mảng sau khi đảo: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

