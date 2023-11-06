import entities.Person;
import services.CivilRegistryManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CivilRegistryManager registryManager = new CivilRegistryManager();
        Person person1 = new Person("Jan", "Kowal", "1990-01-01");
        Person person2 = new Person("Janina", "Kowal", "1992-05-05");

        registryManager.addPerson(person1);
        registryManager.addPerson(person2);

        registryManager.findPerson(person1);
        registryManager.findPerson(person2);

        registryManager.deletePerson(person1);
        registryManager.findPerson(person1);
    }
}
