package home_work_1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();                  // Число 11
        System.out.println("Введите первое число");
        int b = console.nextInt();                  // Число 32
        int result = a&b;                           // получаем 0, 00001011 & 00100000 = 00000000, при применении оператора & если оба бита =1, мы получаем 1, в остальном случае 0
        int result1 = a|b;                          // получаем 43, 00001011 | 00100000 = 00101011, при применении оператора | если один из битов равен 1, мы получаем 1
        System.out.println("Результат побитового & - "+ result);
        System.out.println("Результат побитового | - "+ result1);
    }
}
