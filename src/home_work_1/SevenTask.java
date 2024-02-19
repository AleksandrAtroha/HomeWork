package home_work_1;

public class SevenTask {
    public  static String createPhoneNumber(int[] number)
    {
        return "("+number[0]+number[1]+number[2]+") "+ number[3]+number[4] + number[5]+"-"+number[6]+number[7]+number[8]+number[9];
    }
    public static void main(String[] args) {
        int[] number = {5, 9, 3, 4, 1, 6, 7, 8, 2, 0};
        System.out.println(createPhoneNumber(number));
    }
}
