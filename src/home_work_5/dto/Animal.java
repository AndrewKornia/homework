package home_work_5.dto;


import java.util.Objects;

public class Animal {

    private final String nick;
    private final int age;

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, age);
    }

    @Override
    public String toString() {
        return
                "{ nick='" + nick + '\'' +
                ", age=" + age+" }";
    }
}
