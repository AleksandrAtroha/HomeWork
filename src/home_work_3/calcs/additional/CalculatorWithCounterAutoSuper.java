package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;
    public void incrementCountOperation()
    {
        countOperation++;
    }
    public long getCountOperation()
    {
        return countOperation;
    }
    public double addition(double a,double b)
    {
        incrementCountOperation();
        return super.addition(a,b);
    }
    public double multiplication(double a,double b)
    {
        incrementCountOperation();
        return super.multiplication(a,b);
    }
    public double subtraction(double a,double b)
    {
        incrementCountOperation();
        return super.subtraction(a,b);
    }
    public double division(double a,double b){
        incrementCountOperation();
        return super.division(a,b);
    }
    public double sqrt(double a)
    {
        incrementCountOperation();
        return super.sqrt(a);
    }
    public double abs(double a)
    {
        incrementCountOperation();
        return super.abs(a);
    }
    public double degree(double a, double b)
    {
        incrementCountOperation();
        return super.degree(a,b);
    }
}
