package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double result = calculator.division(28,5);
        calculator.incrementCountOperation();
        result = calculator.degree(result,2);
        calculator.incrementCountOperation();
        result = calculator.addition(calculator.multiplication(15,7),result);
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        System.out.println("Результат выражения= "+result + " количество операций-" + calculator.getCountOperation());
    }
}
