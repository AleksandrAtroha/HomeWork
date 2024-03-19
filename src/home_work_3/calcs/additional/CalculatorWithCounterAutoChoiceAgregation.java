package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
     CalculatorWithOperator calculator;
    CalculatorWithMathCopy calculator1;
    CalculatorWithMathExtends calculator2;
     public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator)
     {
         this.calculator = calculator;
     }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator)
    {
        this.calculator1 = calculator;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator)
    {
        this.calculator2 = calculator;
    }
    private long countOperation;
    public double addition(double a,double b)
    {
        countOperation++;
        if (calculator!=null)
            return calculator.addition(a,b);
        else if(calculator1!=null)
            return calculator1.addition(a,b);
        else
            return calculator2.addition(a,b);
    }
    public double multiplication(double a,double b)
    {
        countOperation++;
        if (calculator!=null)
            return  calculator.multiplication(a,b);
        else if(calculator1!=null)
            return calculator1.multiplication(a,b);
        else
            return calculator2.multiplication(a,b);
    }
    public double subtraction(double a,double b)
    {
        countOperation++;;
        if (calculator!=null)
            return calculator.subtraction(a,b);
        else if(calculator1!=null)
            return calculator1.subtraction(a,b);
        else
            return calculator2.subtraction(a,b);
    }
    public double division(double a,double b){
        countOperation++;
        if (calculator!=null)
            return calculator.division(a,b);
        else if(calculator1!=null)
            return calculator1.division(a,b);
        else
            return calculator2.division(a,b);
    }
    public double sqrt(double a)
    {
        countOperation++;
        if (calculator!=null)
             return calculator.sqrt(a);
        else if(calculator1!=null)
            return calculator1.sqrt(a);
        else
            return calculator2.sqrt(a);
    }
    public double abs(double a)
    {
        countOperation++;
        if (calculator!=null)
            return calculator.abs(a);
        else if(calculator1!=null)
            return calculator1.abs(a);
        else
            return calculator2.abs(a);
    }
    public double degree(double a, double b)
    {
        countOperation++;
        if (calculator!=null)
            return calculator.degree(a,b);
        else if(calculator1!=null)
            return calculator1.degree(a,b);
        else
        return calculator2.degree(a,b);
    }
    public long getCountOperation()
    {
        return countOperation;
    }
}
