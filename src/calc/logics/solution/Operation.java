package calc.logics.solution;

import java.util.Scanner;

/**
 * класс операции над числами
 */
public class Operation {
    static Scanner scanner = new Scanner(System.in);

    static String getOperation() {
        System.out.println("Enter operation: ");
        String operation = scanner.nextLine();
        if (!(operation.equals("+") | operation.equals("-") |
                operation.equals("*") | operation.equals("/"))) {
            System.out.println("Error, enter operation!");
            return getOperation();
        } else {
            return operation;
        }

    }
}