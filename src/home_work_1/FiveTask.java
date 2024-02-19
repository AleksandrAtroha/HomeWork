package home_work_1;

import java.util.Scanner;

public class FiveTask {
    public static boolean sleepIn(boolean weekday,boolean vacation)
    {
        return !weekday || vacation;
    }
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Вводить true либо false");
        System.out.println("Сегодня рабочий день?");
        boolean a = console.nextBoolean();
        System.out.println("У вас отпуск?");
        boolean b = console.nextBoolean();
        boolean result = sleepIn(a,b);
        if(result) System.out.println("Можно спать");
        else System.out.println("Пора вставать на работу");

    }
}
