package home_work_1;

import java.util.Scanner;

public class FourTask6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int year = console.nextInt();
        if(isHighGradeYear(year))
        {
            System.out.println("Год високосный");
        }
        else System.out.println("Год не високосный");
    }
    public static boolean isHighGradeYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
