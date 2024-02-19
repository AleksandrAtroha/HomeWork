package home_work_1;

public class FirstTask3 {
    public static void main(String[] args) {
        int a = 15;
        double b = 42.5;
        int result = a & (int) b;
        System.out.println("Результат побитового & - " + result);
    }
}
/*
В данном коде мы преобразуем 42.5 в int, т.к. побитовые операторы применяются только к целочисленным типам.
После преобразования получаем число 42, переводим 15 и 42 в двоичную, при применении оператора & получаем 10
00001111 - число 15
&
00101010 - число 42
=
00001010 - число 10

 */