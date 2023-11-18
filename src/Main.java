import entities.Deaths;
import entities.Documents;
import entities.Marriage;
import entities.Person;
import services.CivilRegistryManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



        CivilRegistryManager registryManager = new CivilRegistryManager();
        Scanner scanner = new Scanner(System.in);
        List<Documents> documentsCollection = new ArrayList<>();
        List<Deaths> deathsCollection = new ArrayList<>();

        Person person1 = new Person("John", "Doe", "1990-01-15", "85749261380");
        Person person2 = new Person("Jane", "Doe", "1985-08-22", "34126759802");
        Person person3 = new Person("Alice", "Smith", "1995-03-10", "65982314701");
        Person person4 = new Person("Bob", "Johnson", "1980-11-28", "12457896320");
        Person person5 = new Person("Eva", "Brown", "1992-06-05", "98502314671");
        Person person6 = new Person("Michael", "Miller", "1987-09-18", "70315648239");
        Person person7 = new Person("Sophie", "Williams", "1998-04-03", "23679051485");
        Person person8 = new Person("Matthew", "Jones", "1983-12-07", "49871536207");
        Person person9 = new Person("Olivia", "Taylor", "1997-02-14", "81234567903");
        Person person10 = new Person("William", "White", "1982-05-26", "82052645678");

        registryManager.addPerson(person1);
        registryManager.addPerson(person2);
        registryManager.addPerson(person3);
        registryManager.addPerson(person4);
        registryManager.addPerson(person5);
        registryManager.addPerson(person6);
        registryManager.addPerson(person7);
        registryManager.addPerson(person8);
        registryManager.addPerson(person9);
        registryManager.addPerson(person10);



        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Dodaj osobę");
            System.out.println("2. Znajdź osobę");
            System.out.println("3. Usuń osobę");
            System.out.println("4. Wyświetl wszystkie osoby");
            System.out.println("5. Utwórz dokument ślubu");
            System.out.println("6. Utwórz akt zgonu");
            System.out.println("7. Wyjście");
            System.out.print("Wybierz opcję: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPerson(registryManager, scanner);
                    break;
                case 2:
                    findPerson(registryManager, scanner);
                    break;
                case 3:
                    deletePerson(registryManager, scanner);
                    break;
                case 4:
                    registryManager.displayAllPersons();
                    break;
                case 5:
                    System.out.print("Opcja nie działa wybierz inną");
                    break;
                case 6:
                    recordDeath(registryManager, scanner, deathsCollection);
                    break;
                case 7:
                    //nie dziala chyba
                    registryManager.displayAllDeaths(deathsCollection);
                    break;

                case 8:
                    System.out.println("Koniec programu.");
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
            }
        }
    }

    private static void addPerson(CivilRegistryManager registryManager, Scanner scanner) {
        System.out.print("Podaj imię: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj datę urodzenia (RRRR-MM-DD): ");
        String birthDate = scanner.nextLine();
        System.out.print("Podaj PESEL: ");
        String pesel = scanner.nextLine();

        Person person = new Person(firstName, lastName, birthDate, pesel);
        registryManager.addPerson(person);


    }


    private static void findPerson(CivilRegistryManager registryManager, Scanner scanner) {
        System.out.print("Podaj PESEL osoby do wyszukania: ");
        String searchPesel = scanner.nextLine();
        registryManager.findPerson(new Person("", "", "", searchPesel));
    }

    private static void deletePerson(CivilRegistryManager registryManager, Scanner scanner) {
        System.out.print("Podaj PESEL osoby do usunięcia: ");
        String deletePesel = scanner.nextLine();
        registryManager.deletePerson(new Person("", "", "", deletePesel));
        System.out.println("Osoba usunięta z rejestru.");
    }

    private static void recordDeath(CivilRegistryManager registryManager, Scanner scanner,
                                    List<Deaths> deathsCollection) {
        System.out.print("Podaj pesel zmarłego: ");
        String pesel = scanner.nextLine();

        Person deceased = registryManager.findPerson(new Person("", "", "", pesel));

        if (deceased != null) {
            System.out.print("Podaj datę zgonu (RRRR-MM-DD): ");
            String deathDate = scanner.nextLine();
            System.out.print("Podaj przyczynę zgonu: ");
            String causeOfDeath = scanner.nextLine();

            Deaths death = new Deaths(deceased, deathDate, causeOfDeath);
            death.recordDeath();
            deathsCollection.add(death);
        } else {
            System.out.println("Nie można zarejestrować aktu zgonu. Sprawdź poprawność informacji o zmarłym.");
        }
    }





    //nie dziala nie wiem czemu nie umiem naprawić
//    private static void performCivilMarriage(CivilRegistryManager registryManager, Scanner scanner,
//                                             List<Documents> documentsCollection) {
//        System.out.print("Podaj PESEL pierwszego małżonka: ");
//        String pesel1 = scanner.nextLine();
//        Person spouse1 = registryManager.findPerson(pesel1);
//
//        System.out.print("Podaj PESEL drugiego małżonka: ");
//        String pesel2 = scanner.nextLine();
//        Person spouse2 = registryManager.findPerson(pesel2);
//
//        if (spouse1 != null && spouse2 != null) {
//            System.out.print("Podaj datę ślubu (RRRR-MM-DD): ");
//            String marriageDate = scanner.nextLine();
//
//            Marriage marriage = new Marriage(spouse1, spouse2, marriageDate);
//            marriage.performCivilMarriage(documentsCollection);
//        } else {
//            System.out.println("Nie można zarejestrować ślubu. Sprawdź poprawność informacji o małżonkach.");
//        }
//    }


}
