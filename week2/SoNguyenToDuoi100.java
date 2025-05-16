package week2;

public class SoNguyenToDuoi100 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100:");

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

