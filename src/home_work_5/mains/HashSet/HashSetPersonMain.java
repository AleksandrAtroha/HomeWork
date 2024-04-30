package home_work_5.mains.HashSet;

import home_work_5.comporators.Person.NickComporator;
import home_work_5.dto.Person;
import home_work_5.generators.PersonGenerator;

import java.util.*;

public class HashSetPersonMain {
    public static void main(String[] args) {
        HashSet<Person> personList = new HashSet<>();
        PersonGenerator generator = new PersonGenerator();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            String nick = generator.generateRandomRussianString(3, 10);
            String password = generator.generateRandomString(5, 10);
            String name = generator.generateRandomName();
            Person person = new Person(nick, password, name);
            personList.add(person);
        }
        long stop = System.currentTimeMillis();

        for (Person person : personList) {
            System.out.print("[Nick: " + person.getNick());
            System.out.print(" Password: " + person.getPassword());
            System.out.print(" Name: " + person.getName() + "]");
            System.out.println();
        }
        System.out.println("Отсортированная колекция:");
        List<Person> sortedList = new ArrayList<>(personList);
        sortedList.sort(new NickComporator());
        for (Person person : sortedList) {
            System.out.print("[Nick: " + person.getNick());
            System.out.print(" Password: " + person.getPassword());
            System.out.print(" Name: " + person.getName() + "]");
            System.out.println();
        }

        System.out.println("Заполнение коллекции заняло: " + (stop - start) + " мс");
        start = System.currentTimeMillis();
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
        }
        stop = System.currentTimeMillis();
        System.out.println("Итерирование коллекции с помощью iterator: " + (stop - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < personList.size(); i++) {
            personList.contains("1");
        }
        stop = System.currentTimeMillis();
        System.out.println("Итерирование коллекции с помощью for: " + (stop - start) + " мс");

        start = System.currentTimeMillis();
        iterator = personList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.currentTimeMillis();
        System.out.println("Удаление всех элементов коллекции с помощью iterator: " + (stop - start) + " мс");
        for (int i = 0; i < 100_000; i++) {
            String nick = generator.generateRandomRussianString(3, 10);
            String password = generator.generateRandomString(5, 10);
            String name = generator.generateRandomName();
            Person person = new Person(nick, password, name);
            personList.add(person);
        }
        start = System.currentTimeMillis();
        personList.clear();
        stop = System.currentTimeMillis();
        System.out.println("Удаление всех элементов коллекции с помощью метода clear: " + (stop - start) + " мс");
    }
}
