package home_work_1;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        double a,b,c,d,x1,x2;
        Scanner console =new Scanner(System.in);
        System.out.println("Решение уравнение вида: ax^2 + bx + c = 0");
        System.out.println("Введите число а");
        a = console.nextDouble();
        System.out.println("Введите число b");
        b = console.nextDouble();
        System.out.println("Введите число c");
        c = console.nextDouble();
        System.out.println("a ="+ a+ " ,b ="+b+" ,c ="+ c);
        d = Math.pow(b,2) - 4*a*c;
        if(d>0)
        {
             x1= (-b +Math.sqrt(d))/ (2*a);
             x2 = (-b -Math.sqrt(d))/ (2*a);
             System.out.printf("Корни уравнения x1 = %.1f x2 = %.1f дискриминант = %.1f",x1,x2,d);
        }
        else if(d==0)
        {
            x1 = -b/ (2*a);
            System.out.printf("Уравнение имеет один корень x1 =%.1f дискриминант = %.1f",x1,d);
        }
        else
        {
            System.out.printf("Уравнение не имеет вещественных корней, дискриминант = %.1f",d);
        }
    }
}
