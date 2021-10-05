package buoi_2;

import java.util.Scanner;

public class Bai12 {


    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên");
        userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 9) {
            throw new IllegalArgumentException("Vui lòng nhập số từ 1 đến 9");
        }

        for (int i = 1; i < userInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
