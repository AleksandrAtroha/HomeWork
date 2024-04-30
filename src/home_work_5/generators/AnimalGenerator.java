package home_work_5.generators;

import java.util.Random;

public class AnimalGenerator extends Generator{
    private final String[] names= {"Бобик","Тузик","Шарик","Матильда"};
    public  String generateRandomName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
}
