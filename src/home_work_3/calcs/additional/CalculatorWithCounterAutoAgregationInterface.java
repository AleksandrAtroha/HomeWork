package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator calculator;
    private long countOperation;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator)
    {
        this.calculator = calculator;
    }

    public double addition(double a,double b)
    {
        countOperation++;
        return calculator.addition(a,b);
    }
    public double multiplication(double a,double b)
    {
        countOperation++;
        return calculator.multiplication(a,b);
    }
    public double subtraction(double a,double b)
    {
        countOperation++;;
        return calculator.subtraction(a,b);
    }
    public double division(double a,double b){
        countOperation++;
        return calculator.division(a,b);
    }
    public double sqrt(double a)
    {
        countOperation++;
        return calculator.sqrt(a);
    }
    public double abs(double a)
    {
        countOperation++;
        return calculator.abs(a);
    }
    public double degree(double a, double b)
    {
        countOperation++;
        return calculator.degree(a,b);
    }
    public long getCountOperation()
    {
        return countOperation;
    }
}
