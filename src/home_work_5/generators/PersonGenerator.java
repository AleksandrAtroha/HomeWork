package home_work_5.generators;

import java.util.Random;

public class PersonGenerator extends Generator{
    private final String[] names= {"Александр","Кирилл","Катя","Алина","Максим"};
    public  String generateRandomName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
}
