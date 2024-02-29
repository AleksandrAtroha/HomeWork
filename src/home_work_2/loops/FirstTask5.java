package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class FirstTask5 {
    public static int findmaxdigit(int number)
    {
        int maxDigit = 0;
        while (number>0)
        {
            int digit = number%10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }
    public static  int probabilityEvenNumbers()
    {
        Random random = new Random();
        int amount = 0;
        for (int i =0;i<2000;i++)
        {
            if(random.nextInt()%2==0)
                amount++;
        }
        return amount;
    }
    public static int amountOfEvenDigits(int number)
    {
        int amountEven = 0;
        while (number>0)
        {
            int digit = number%10;
            if (digit%2==0){
                amountEven++;
            }
            number /= 10;
        }
        return amountEven;
    }
    public static int amountOfOddDigits(int number)
    {
        int amountOdd = 0;
        while (number>0)
        {
            int digit = number%10;
            if (digit%2!=0){
                amountOdd++;
            }
            number /= 10;
        }
        return amountOdd;
    }
    public static void printFibonaci(int count){
        int a = 0;
        int b = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
    public static void printDigitsWithStep(int max,int min,int step){
        for (int i=min;i<=max;i+=step)
        {
            System.out.print(i +" ");
        }
    }
    public static void  printReverseNumber(int number) {
        while (number > 0) {
            System.out.print(number % 10 );
            number = number / 10;
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        System.out.println("Максимальная цифра числа = "+findmaxdigit(console.nextInt()));
        System.out.println("Количество четных чисел из 2000= "+ probabilityEvenNumbers());
        System.out.println("Введите натуральное число");
        int a = console.nextInt();
        System.out.println("Количество четных цифр = "+ amountOfEvenDigits(a) + " Количество нечетных цифр = "+ amountOfOddDigits(a));
        System.out.println("Введите количество элементов ряда Фибоначи");
        printFibonaci(console.nextInt());
        System.out.println("Введите минимальное значение");
        int min = console.nextInt();
        System.out.println("Введите максимальное значение");
        int max = console.nextInt();
        System.out.println("Введите шаг значение");
        int step = console.nextInt();
        printDigitsWithStep(max,min,step);
        System.out.println("Введите число");
        printReverseNumber(console.nextInt());
    }
}
