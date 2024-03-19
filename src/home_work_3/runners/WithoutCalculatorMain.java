package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double a = 5;
        double result = 4.1 + 15 * 7 + Math.pow(28/a,2);
        System.out.println("Результат выражения= "+result);
    }
}
