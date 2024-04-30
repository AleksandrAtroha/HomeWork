package home_work_5.generators;

import java.util.Random;

public abstract class Generator {
    public String generateRandomString(int minLength, int maxLength){
        Random random = new Random();
        StringBuilder str = new StringBuilder();
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(126);
            char randomChar = (char) ('a' + randomIndex);
            str.append(randomChar);
        }
        return str.toString();
    }
    public  String generateRandomRussianString(int minLength, int maxLength) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(32);
            char randomChar = (char) ('а' + randomIndex);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }
}
