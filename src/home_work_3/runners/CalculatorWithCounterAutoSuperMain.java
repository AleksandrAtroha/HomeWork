package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double result = calculator.degree(calculator.division(28,5),2);
        result = calculator.addition(calculator.multiplication(15,7),result);
        System.out.println("Результат выражения= "+result + " количество операций-"+ calculator.getCountOperation());
    }
}
