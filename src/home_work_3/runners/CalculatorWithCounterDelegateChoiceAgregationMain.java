package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopy =new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperator);
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);
        double result = calculator.degree(calculator.division(28,5),2);
        result = calculator.addition(calculator.multiplication(15,7),result);
        System.out.println("Результат выражения= "+result + " количество операций-"+ calculator.getCountOperation());
        result = calculator1.degree(calculator1.division(28,5),2);
        result = calculator1.addition(calculator1.multiplication(15,7),result);
        System.out.println("Результат выражения= "+result + " количество операций-"+ calculator1.getCountOperation());
         result = calculator2.degree(calculator2.division(28,5),2);
        result = calculator2.addition(calculator2.multiplication(15,7),result);
        System.out.println("Результат выражения= "+result + " количество операций-"+ calculator2.getCountOperation());
    }
}
