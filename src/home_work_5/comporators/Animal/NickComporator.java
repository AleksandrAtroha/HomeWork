package home_work_5.comporators.Animal;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class NickComporator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        int ageComparison = Integer.compare(a1.getAge(), a2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        } else {
            return a1.getNick().compareTo(a2.getNick());
        }
    }
}
