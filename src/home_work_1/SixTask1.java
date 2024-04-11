package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class SixTask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = console.nextLine();
        System.out.println(checkName(name));
    }
    public static String checkName(String name){
        if(Objects.equals(name,"Вася")) {
            return "Привет!" + "\n" + "Я тебя так долго ждал";
        }
        else return "Добрый день, а вы кто?";
    }
}
