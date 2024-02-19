package home_work_1;

import java.util.Scanner;

public class FourTask1 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Введите второе число");
        int b = console.nextInt();
        if (a%2!=0 && b%2!=0)
        {
            System.out.println("Оба числа нечетные");
        }
        else if(a%2!=0)
        {
            System.out.println("Первое число нечетное");
        }
        else if(b%2!=0)
        {
            System.out.println("Второе число нечетное");
        }
        else System.out.println("Оба числа четные");
    }
}
