package services;

import entities.Person;

import java.util.List;
import java.util.ArrayList;

public class CivilRegistryManager {
    private static List<Object> registry = new ArrayList<Object>();

    public void findPerson(Object obj){
        if(obj instanceof Person){
            for(Object o : registry){
                if(o instanceof Person){
                    Person p = (Person) o;
                    if(p.equals(obj)){
                        System.out.println("Osoba została znaleziona w  rejestrze: " + p);
                        return;
                    }
                }
            }
            System.out.println("Osoba nie została znaleziona w rejestrze.");
        } else {
            System.out.println("Nieprawidłowe dane.");
        }

    }

    public void deletePerson(Object obj){
        if(obj instanceof Person){
            if(registry.remove(obj)){
                System.out.println("Osoba usunięta z rejestru.");
            } else {
                System.out.println("Osoba nie została znaleziona w rejestrze.");
            }
        } else {
            System.out.println("Nieprawidłowe dane.");
        }

    }

    public void addPerson(Object obj){
        if(obj instanceof Person){
            registry.add(obj);
            System.out.println("Osoba została dodana do rejestru.");
        } else {
            System.out.println("Nieprawidlowe dane.");
        }
    }

    }




