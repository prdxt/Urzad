package entities;

import java.util.ArrayList;
import java.util.List;

public class Marriage {
    private Person spouse1;
    private Person spouse2;
    private String marriageDate;

    public Marriage(Person spouse1, Person spouse2, String marriageDate) {
        this.spouse1 = spouse1;
        this.spouse2 = spouse2;
        this.marriageDate = marriageDate;
    }

    public void performCivilMarriage(List<Documents> documentsCollection) {
        if (spouse1 != null && spouse2 != null) {
            String marriageCertificate = String.format("Akt ślubu między %s a %s, zawarty dnia %s.",
                    spouse1.getFirstName() + " " + spouse1.getLastName(),
                    spouse2.getFirstName() + " " + spouse2.getLastName(),
                    marriageDate);

            Documents marriageDocument = new Documents("Marriage Certificate", marriageCertificate);

            documentsCollection.add(marriageDocument);

            System.out.println("Ślub cywilny został zarejestrowany, dodano akt ślubu do dokumentów.");
        } else {
            System.out.println("Nie można zarejestrować ślubu. Sprawdź poprawność informacji o małżonkach.");
        }
    }



    public Person getSpouse1() {
        return spouse1;
    }

    public void setSpouse1(Person spouse1) {
        this.spouse1 = spouse1;
    }

    public Person getSpouse2() {
        return spouse2;
    }

    public void setSpouse2(Person spouse2) {
        this.spouse2 = spouse2;
    }

    public String getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(String marriageDate) {
        this.marriageDate = marriageDate;
    }
}
