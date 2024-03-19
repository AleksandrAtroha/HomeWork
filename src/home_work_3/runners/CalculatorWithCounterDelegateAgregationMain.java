package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculatorWithCounter = new CalculatorWithCounterAutoAgregation(calculator);
        double result = calculatorWithCounter.division(28,5);
        result = calculatorWithCounter.degree(result,2);
        result = calculatorWithCounter.addition(4.1, result);
        result = calculatorWithCounter.addition(result, calculatorWithCounter.multiplication(15, 7));
        System.out.println("Результат выражения= "+result + " количество операций-"+ calculatorWithCounter.getCountOperation());
    }
}
