package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        double result = calculator.division(28,5);
        result = calculator.degree(result,2);
        result = calculator.addition(4.1, result);
        result = calculator.addition(result, calculator.multiplication(15, 7));
        System.out.println("Результат выражения= "+result+ " количество операций-"+ calculator.getCountOperation());
    }
}
