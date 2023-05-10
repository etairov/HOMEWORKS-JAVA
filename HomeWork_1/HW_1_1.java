// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package HomeWork_1;

import java.util.Scanner;


public class HW_1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");

        String number = iScanner.nextLine();
        int num = Integer.parseInt(number);
        iScanner.close();

        int amount;
        amount = (num * (num + 1)) / 2;

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i;
        }

        System.out.printf("Сумма чисел в последовательности = %s\n", amount);
        System.out.printf("Произведение чисел в последовательности = %s\n", result);
    }
}
