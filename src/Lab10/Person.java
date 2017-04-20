package Lab10;

/**
 * Created by Work on 19.04.2017.
 */
public class Person {

    String surname;
    String phone;

    public Person(String surname, String phone) {
        this.surname = surname;
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "surname='" + surname + '\'' +
                ", phone='" + phone + '\'';
    }
}
