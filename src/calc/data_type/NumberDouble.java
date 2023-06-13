package calc.data_type;

import java.util.Scanner;

/**
 * класс ввода рациональных чисел
 */

public class NumberDouble {

    static Scanner scanner = new Scanner(System.in);

    /**
     * метод ввода рациональных чисел
     * @return введенное число
     */

    public static double getNumber() {
        System.out.println("Enter number: ");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Error, enter number!");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
}