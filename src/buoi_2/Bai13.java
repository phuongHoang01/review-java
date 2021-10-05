package buoi_2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bai13 {

    public static List<Integer> numbers = new ArrayList<Integer>();

    public static void addNumber() {
        boolean isContinue;

        try {
            do {
                isContinue = false;
                int userInput;
                Scanner scanner = new Scanner(System.in);

                System.out.println("Nhập số nguyên");
                userInput = Integer.parseInt(scanner.nextLine());

            } while (isContinue);
        } catch (InputMismatchException ex) {
            System.out.println("Input không hợp lệ");
        } catch (NumberFormatException exception) {
            System.out.println("Kiểu dữ liệu không hợp lệ");
        }
    }

    public static void main(String[] args) {
        addNumber();
    }
}
