package home_work_2.loops;

public class FirstTask6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + "*" + i +" = " +  i * j + " | ");
            }
            System.out.println();
        }
    }
}
