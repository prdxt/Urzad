package entities;

public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;

    public Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return " " +
                "Imię='" + firstName + '\'' +
                ", Nazwisko='" + lastName + '\'' +
                ", Data urodzenia='" + birthDate + '\'' +
                ' ';
    }
}