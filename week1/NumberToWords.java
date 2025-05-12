package week1;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen khong am khong qua 3 chu so :  ");
        int number = sc.nextInt();
        if (number<0 || number>100) {
            System.out.println("out of ability");
        } else{
            System.out.println(convertNumberToWords(number));
        }
    }
    public static String oneDigitToWords (int number) {
        switch (number){
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static String teensToWords (int number) {
        switch (number){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }
    public static String tensToWords (int number) {
        switch (number){
            case 1: return "twenty";
            case 2: return "thirty";
            case 3: return "forty";
            case 4: return "fifty";
            case 5: return "sixty";
            case 6: return "seventy";
            case 7: return "eighty";
            case 8: return "ninety";
            default: return "";
        }
    }
    public static String convertNumberToWords (int number) {
        if (number < 10) {
            return oneDigitToWords(number);
        } else if (number < 20) {
            return teensToWords(number);
        }else if (number < 100) {
            int ones = number % 10;
            int tens = number / 10;
            if (ones == 0) {
                return tensToWords(tens);
            } else {
                return tensToWords(tens) + " " + oneDigitToWords(ones);
            }
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;
            if (remainder == 0) {
                return oneDigitToWords(hundreds)+ " hundered";
            } else {
                return oneDigitToWords(hundreds) + " hundred and " + convertNumberToWords(remainder);
            }
        }
    }

}