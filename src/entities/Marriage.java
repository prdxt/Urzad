package entities;

import entities.Person;

public class Marriage {
    private Person spouse1;
    private Person spouse2;
    private String marriageDate;

    public Marriage(Person spouse1, Person spouse2, String marriageDate) {
        this.spouse1 = spouse1;
        this.spouse2 = spouse2;
        this.marriageDate = marriageDate;
    }


}
