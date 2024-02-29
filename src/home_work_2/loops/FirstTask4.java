package home_work_2.loops;

import java.io.Console;
import java.util.Scanner;

public class FirstTask4 {
    public static void main(String[] args) {
        long a = 1;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целочисленное число");
        int n = console.nextInt();
        while (true) {
            a *= n;
            if (a == Long.MIN_VALUE) {
                System.out.println("Переполнение: " + a);
                break;
            }
        }
        a *= n;
        System.out.println("После переполнения: " + a);
    }
}
