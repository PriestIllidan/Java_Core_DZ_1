package calc;

import calc.view.ViewCalc;

/**
 * класс запуска приложения "Калькулятор"
 */

public class Main {
    public static void main(String[] args) {
        ViewCalc calc = new ViewCalc();
        calc.clickButton();
    }
}