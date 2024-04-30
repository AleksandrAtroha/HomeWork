package home_work_5.dto;

public class Animal {
    private int age;
    private String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Возраст:" + age +
                ", Кличка:'" + nick + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }
}
