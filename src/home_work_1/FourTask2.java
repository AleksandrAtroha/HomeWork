package home_work_1;

import java.util.Scanner;

public class FourTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        System.out.println("Среднее число = " + getAverageNumber(a,b,c));
    }
    public static double getAverageNumber(double a, double b, double c){
        if((a>b && a<c) || (a<b&&a>c)) return a;
        if((b>a && b<c) || (b<a&&b>c)) return b;
        return c;
    }
}
