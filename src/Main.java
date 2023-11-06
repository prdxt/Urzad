import entities.Person;
import services.CivilRegistryManager;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CivilRegistryManager registryManager = new CivilRegistryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Dodaj osobę");
            System.out.println("2. Znajdź osobę");
            System.out.println("3. Usuń osobę");
            System.out.println("4. Wyjście");
            System.out.print("Wybierz opcję: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Podaj imię: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Podaj nazwisko: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Podaj datę urodzenia: ");
                    String birthDate = scanner.nextLine();
                    Person person = new Person(firstName, lastName, birthDate);
                    registryManager.addPerson(person);

                    break;
                case 2:
                    System.out.print("Podaj imię osoby do wyszukania: ");
//                    String searchFirstName = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Podaj imię osoby do usunięcia: ");
//                    String delete = scanner.nextLine();

                    break;
                case 4:
                    System.out.println("Koniec programu.");
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
            }
        }
    }
}
