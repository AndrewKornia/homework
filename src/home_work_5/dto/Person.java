package home_work_5.dto;


import java.util.Objects;

public class Person  {

    private final String name;
    private final String password ;
    private final String nick;

    public int getPassword() {
        return password.length();
    }

    public String getNick() {
        return nick;
    }

    public Person(String name, String password, String nick) {
        this.name = name;
        this.password = password;
        this.nick = nick;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(password, person.password) && Objects.equals(nick, person.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, nick);
    }

    @Override
    public String toString() {
        return
                "{ name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nick='" + nick+" }";

    }
}
