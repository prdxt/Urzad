package entities;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String pesel;

    // zwykły konstruktor
    public Person(String firstName, String lastName, String birthDate, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
    }

    // generowanie pesela
    public Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = generatePesel();
    }

    // Konstruktor bez peselu i daty urodzenia - generuje pesel i datę urodzenia automatycznie
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = generateBirthDate();
        this.pesel = generatePesel();
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate) &&
                Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, pesel);
    }

    @Override
    public String toString() {
        return String.format("Obywatel:{ " +
                "Imię='%s', " +
                "Nazwisko='%s', " +
                "Data urodzenia='%s', " +
                "PESEL='%s' }", firstName, lastName, birthDate, pesel);
    }

    private String generatePesel() {
       //logika metody której nie chce mi się dodawać bo za dlugo by sie to robilo
        return "generatedPesel";
    }

    private String generateBirthDate() {
        // tak samo jak w powyższym przypadku
        return "generatedBirthDate";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
