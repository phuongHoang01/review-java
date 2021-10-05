package buoi_2;

import java.util.Scanner;

public class Bai11 {

    public static int calculateLogBase2(float number) {
        return (int) Math.floor(Math.log(number) / Math.log(2.0));
    }

    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên");
        userInput = scanner.nextInt();

        if (userInput <= 0) {
            throw new IllegalArgumentException("Không phải số nguyên dương");
        }

        System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(n) là: " + calculateLogBase2(userInput));
    }
}
