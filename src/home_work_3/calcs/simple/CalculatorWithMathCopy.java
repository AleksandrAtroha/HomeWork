package home_work_3.calcs.simple;
import home_work_3.calcs.api.ICalculator;
public class CalculatorWithMathCopy implements ICalculator {
    private double result;
    @Override
    public double division(double a,double b){
        if(b==0)
        {
            System.out.println("Деление на ноль невозможно");
        }
        result = a/b;
        return result;
    }
    @Override
    public double multiplication(double a,double b)
    {
        result = a*b;
        return result;
    }
    @Override
    public double addition(double a,double b)
    {
        result = a+b;
        return result;
    }
    @Override
    public double subtraction(double a,double b)
    {
        result= a-b;
        return result;
    }
    @Override
    public double abs(double a) {
        result = Math.abs(a);
        return result;
    }
    @Override
    public double degree(double a,double power)
    {
        result = Math.pow(a,power);
        return result;
    }
    @Override
    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Квадратный корень из отрицательного числа невозможен");
        }
        result = Math.sqrt(a);
        return result;
    }
}
