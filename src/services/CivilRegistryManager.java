package services;

import entities.Deaths;
import entities.Person;

import java.util.List;
import java.util.ArrayList;

public class CivilRegistryManager {
    private static List<Person> registry = new ArrayList<>();

    public Person findPerson(Person personToFind) {
        for (Person p : registry) {
            if (p.getPesel().equals(personToFind.getPesel())) {
                System.out.println("Osoba została znaleziona w rejestrze: " + p);
                return p;
            }
        }
        System.out.println("Osoba o podanym PESELu nie została znaleziona w rejestrze.");
        return personToFind;
    }


    public void deletePerson(Person personToDelete){
        if (registry.remove(personToDelete)) {
            System.out.println("Osoba usunięta z rejestru.");
        } else {
            System.out.println("Osoba nie została znaleziona w rejestrze.");
        }
    }

    public void addPerson(Person personToAdd){
        if (validatePersonData(personToAdd)) {
            registry.add(personToAdd);
            System.out.println("Osoba została dodana do rejestru.");
        } else {
            System.out.println("Nie dodano osoby do rejestru z powodu błędnych danych.");
        }
    }
    public void displayAllPersons() {
        if (registry.isEmpty()) {
            System.out.println("Rejestr jest pusty.");
        } else {
            System.out.println("Wszystkie osoby w rejestrze:");
            for (Person person : registry) {
                System.out.println(person);
            }
        }
    }

    public void displayAllDeaths(List<Deaths> deathsCollection) {
        if (deathsCollection.isEmpty()) {
            System.out.println("Brak zarejestrowanych aktów zgonu.");
        } else {
            System.out.println("Wszystkie akty zgonu:");
            for (Deaths death : deathsCollection) {
                System.out.println(death);
            }
        }
    }



    private boolean validatePersonData(Person person) {
        if (!Validator.validatePesel(person.getPesel())) {
            return false;
        }

        return true;
    }



}

