package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result = calculator.degree(calculator.division(28,5),2);
        result = calculator.addition(calculator.multiplication(15,7),result);
        System.out.println("Результат выражения= "+result);
    }
}
