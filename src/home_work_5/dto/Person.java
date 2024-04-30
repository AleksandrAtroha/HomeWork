package home_work_5.dto;

public class Person {
    private String nick;
    private String password;
    private String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Псевдоним:'" + nick + '\'' +
                ", Пароль:'" + password + '\'' +
                ", Имя:'" + name + '\'' +
                '}';
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
