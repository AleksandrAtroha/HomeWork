package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double result = calculator.degree(calculator.division(28,5),2);
        result = calculator.addition(calculator.multiplication(15,7),result);
        System.out.println("Результат выражения= "+result);
    }
}
