package calc.data_type;

import java.util.Scanner;

/**
 * класс ввода целых чисел
 */
public class NumberInt {

    static Scanner scanner = new Scanner(System.in);

    /**
     * метод ввода целых чисел
     * @return введенное число
     */

    public static int getNumber() {
        System.out.println("Enter number: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Error, enter number!");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
}