package home_work_2.loops;

import java.util.Scanner;

public class FirstTask3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        double number = console.nextDouble();
        System.out.println("Введите степень");
        int n = console.nextInt();
        if(n>=0)
        {
            System.out.printf(number + "^"+ n+" = %.3f", pow(number,n));
        }
    }
    public static double pow(double number,int degree){
        double result = 1;
        for(int i=0;i<degree;i++)
        {
            result *= number;
        }
        return result;
    }
}
