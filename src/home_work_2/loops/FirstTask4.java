package home_work_2.loops;
import java.util.Scanner;

public class FirstTask4 {
    public static void main(String[] args) {
        long a = 1;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целочисленное число");
        int n = console.nextInt();
        long beforeOverflow = multiplyOverflow(a,n);
        System.out.println("До переполнения: " + beforeOverflow);
        System.out.println("После переполнения: " + beforeOverflow*n);
    }
    public static long multiplyOverflow(long a, int n) {
        while (true) {
            long previousValue = a;
            a *= n;
            if (a < previousValue) {
                return previousValue;
            }
        }
    }
}
