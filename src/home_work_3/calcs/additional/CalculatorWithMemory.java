package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator calculator;
    private double memory;
    private double result;
    private long countOperation;
    public CalculatorWithMemory(ICalculator calculator)
    {
        this.calculator = calculator;
    }
    public double addition(double a,double b)
    {
        result = calculator.addition(a,b);
        return result;
    }
    public double multiplication(double a,double b)
    {
        result =calculator.multiplication(a,b);
        return result;
    }
    public double subtraction(double a,double b)
    {
        result = calculator.subtraction(a,b);
        return result;
    }
    public double division(double a,double b)
    {
        result =calculator.division(a,b);
        return result;
    }
    public double sqrt(double a)
    {
        result =calculator.sqrt(a);
        return result;
    }
    public double abs(double a)
    {
        result =calculator.abs(a);
        return result;
    }
    public double degree(double a, double b)
    {
        result =calculator.degree(a,b);
        return result;
    }
    public void  save()
    {
        memory = result;
    }
    public double load()
    {
        double temp = memory;
        memory =0;
        return temp;
    }
}
