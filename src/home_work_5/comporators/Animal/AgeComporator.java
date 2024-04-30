package home_work_5.comporators.Animal;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class AgeComporator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getAge() - a2.getAge();
    }
}
