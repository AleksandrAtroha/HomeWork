package home_work_1;

public class EightTask {
    public static String toBinaryString(byte number)
    {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<8;i++)
        {
             str.append(Integer.toString(number % 2));
             number = (byte) (number/2);
        }
        return str.reverse().toString();
    }
    public static void main(String[] args) {

        System.out.println(toBinaryString((byte) 42));
        System.out.println(toBinaryString((byte) 15));
    }
}
