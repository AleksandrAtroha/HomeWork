package home_work_1;

import java.util.Scanner;

public class FourTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        if((a>b && a<c) || (a<b&&a>c)) System.out.println("Число: " +a+" является средним");
        else if((b>a && b<c) || (b<a&&b>c)) System.out.println("Число: " +b+" является средним");
        else System.out.println("Число: " +c+" является средним");
    }
}
