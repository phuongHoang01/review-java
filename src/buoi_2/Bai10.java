package buoi_2;

import java.util.Scanner;

public class Bai10 {

    static final int BEGIN_OF_PRIME = 2;

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = BEGIN_OF_PRIME; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sumOfPrime = 0;

        System.out.print("Nhập số nguyên: ");
        int userInput = scanner.nextInt();

        if (userInput <= 0) {
            throw new IllegalArgumentException("Không phải số nguyên dương");
        }

        for (int i = BEGIN_OF_PRIME; i <= userInput; i++) {
            if (isPrime(i)) {
                sumOfPrime += i;
            }
        }

        System.out.println("Tổng số nguyên tố từ 0 đến " + userInput + " là: " + sumOfPrime);
    }
}
