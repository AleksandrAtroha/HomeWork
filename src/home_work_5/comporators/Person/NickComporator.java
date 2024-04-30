package home_work_5.comporators.Person;

import home_work_5.dto.Person;

import java.util.Comparator;
public class NickComporator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        int passwordComparison = Integer.compare(p1.getPassword().length(), p2.getPassword().length());
        if (passwordComparison != 0) {
            return passwordComparison;
        } else {
            return p1.getNick().compareTo(p2.getNick());
        }
    }
}
