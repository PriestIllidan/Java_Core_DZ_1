package calc.logics.solution;

import calc.Calc;
import calc.data_type.NumberInt;

/**
 * класс логики калькулятора целых чисел
 */
public class CalcInt implements Calc {
    @Override
    public void calc() {
        int n1 = NumberInt.getNumber();

        String operation = Operation.getOperation();

        int n2 = NumberInt.getNumber();

        switch (operation) {
            case "+":
                System.out.println("Result = " + (n1 + n2));
                break;
            case "-":
                System.out.println("Result = " + (n1 - n2));
                break;
            case "*":
                System.out.println("Result = " + (n1 * n2));
                break;
            case "/":
                System.out.println("Result = " + (n1 / n2));
                break;

            default:
                break;

        }
    }
}