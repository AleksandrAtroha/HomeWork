package home_work_2.loops;

import java.util.Scanner;

public class FirstTask3 {
    public static void main(String[] args) {
        double result = 1;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        double number = console.nextDouble();
        System.out.println("Введите степень");
        int n = console.nextInt();
        if(n>=0)
        {
            for(int i=0;i<n;i++)
            {
                result *= number;
            }
        }
        System.out.printf(number + "^"+ n+" = %.3f", result);
    }
}
