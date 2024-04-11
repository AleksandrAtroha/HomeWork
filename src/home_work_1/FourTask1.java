package home_work_1;

import java.util.Scanner;
public class FourTask1 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Введите второе число");
        int b = console.nextInt();
        if ( findOddNumber(a) && findOddNumber(b))
        {
            System.out.println("Оба числа нечетные");
        }
        else if(findOddNumber(a))
        {
            System.out.println("Первое число нечетное");
        }
        else if(findOddNumber(b))
        {
            System.out.println("Второе число нечетное");
        }
        else System.out.println("Оба числа четные");
    }
    public static boolean findOddNumber(int number){
        return number%2!=0;
    }
}
