package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithMemory calculator = new CalculatorWithMemory(calc);
        calculator.division(28,5);
        calculator.save();
        calculator.degree(calculator.load(),2);
        calculator.save();
        calculator.addition(4.1, calculator.load());
        calculator.save();
        calculator.addition(calculator.load(), calculator.multiplication(15, 7));
        calculator.save();
        System.out.printf("%.2f%n", calculator.load()); // 140.46
    }
}
