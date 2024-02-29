package home_work_2.loops;

public class FirstTask1_2 {
    public static long recurs(long number){
        long result =1;
        if (number == 1 || number == 0) {
            return result;
        }
            result = number*recurs(number-1);
        return  result;
    }

    public static void main(String[] args) {
        long number = Long.parseLong(args[0]);
        if (number < 1) {
            System.out.println("Число должно быть положительным и не =0.");
        }
        for (int i = 1; i <= number; i++) {
            if(i==number) System.out.print(i);
            else{
                System.out.print(i+"*");
            }
        }
        System.out.println("="+recurs(number));

    }
}
