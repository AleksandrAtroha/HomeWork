package home_work_5.mains.TreeSet;

import home_work_5.comporators.Animal.NickComporator;
import home_work_5.dto.Animal;
import home_work_5.generators.AnimalGenerator;

import java.util.*;

public class TreeSetAnimalMain {
    public static void main(String[] args) {
        TreeSet<Animal> animalList = new TreeSet<>(new NickComporator());
        AnimalGenerator generator = new AnimalGenerator();
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            String nick = generator.generateRandomName();
            int age = random.nextInt(30);
            Animal animal = new Animal(age,nick);
            animalList.add(animal);
        }
        long stop = System.currentTimeMillis();
        for (Animal animal : animalList) {
            System.out.print("[Age: " + animal.getAge());
            System.out.print(" Nick: " + animal.getNick()+"]");
            System.out.println();
        }
        System.out.println("Заполнение коллекции заняло: " + (stop - start) + " мс");
        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
        }
        stop = System.currentTimeMillis();
        System.out.println("Итерирование коллекции с помощью iterator: " + (stop - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < animalList.size(); i++) {
            animalList.getFirst();
        }
        stop = System.currentTimeMillis();
        System.out.println("Итерирование коллекции с помощью for: " + (stop - start) + " мс");

        start = System.currentTimeMillis();
        iterator = animalList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.currentTimeMillis();
        System.out.println("Удаление всех элементов коллекции с помощью iterator: " + (stop - start) + " мс");
        for (int i = 0; i < 100_000; i++) {
            String nick = generator.generateRandomName();
            int age = random.nextInt(30);
            Animal animal = new Animal(age,nick);
            animalList.add(animal);
        }
        start = System.currentTimeMillis();
        animalList.clear();
        stop = System.currentTimeMillis();
        System.out.println("Удаление всех элементов коллекции с помощью метода clear: " + (stop - start) + " мс");
    }
}
