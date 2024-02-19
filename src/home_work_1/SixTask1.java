package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class SixTask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = console.nextLine();
        boolean result = Objects.equals(name,"Вася");
        if(result) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else System.out.println("Добрый день, а вы кто?");
    }
}
