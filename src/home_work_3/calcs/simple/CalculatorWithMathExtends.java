package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double degree(double a, double b)
    {
        return Math.pow(a, b);
    }

    public double abs(double a)
    {
        return Math.abs(a);
    }

    public double sqrt(double a)
    {
        return Math.sqrt(a);
    }
}
