package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    private double result;
    public double division(double a,double b){
        if(b==0)
        {
            System.out.println("Деление на ноль невозможно");
        }
        result = a/b;
        return result;
    }
    public double multiplication(double a,double b)
    {
        result = a*b;
        return result;
    }
    public double addition(double a,double b)
    {
        result = a+b;
        return result;
    }
    public double subtraction(double a,double b)
    {
        result= a-b;
        return result;
    }
    public double abs(double a) {
        if (a < 0) {
            result = -a;
        } else {
            result = a;
        }
        return result;
    }
    public double degree(double a,double power)
    {
        result = 1;
        for (int i =1;i<=power;i++)
        {
            result*=a;
        }
        return result;
    }
    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Квадратный корень из отрицательного числа невозможен");
        }
        result = Math.sqrt(a);
        return result;
    }
}
