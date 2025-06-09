package week5.decimalToBinaryConverter;

import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        int decimal = 30;
        String binary = convertToBinary(decimal);
        System.out.println("Số " + decimal + " ở hệ nhị phân là: " + binary);
    }

    public static String convertToBinary(int number) {
        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.length() > 0 ? binary.toString() : "0";
    }
}

