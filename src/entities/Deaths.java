package entities;

public class Deaths {
    private Person deceased;
    private String deathDate;
    private String causeOfDeath;

    public Deaths(Person deceased, String deathDate, String causeOfDeath) {
        this.deceased = deceased;
        this.deathDate = deathDate;
        this.causeOfDeath = causeOfDeath;
    }

    public Person getDeceased() {
        return deceased;
    }

    public void setDeceased(Person deceased) {
        this.deceased = deceased;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public void recordDeath() {
        System.out.println("Akt zgonu dla: " + deceased.getFirstName() + " " + deceased.getLastName());
        System.out.println("Data zgonu: " + deathDate);
        System.out.println("Przyczyna zgonu: " + causeOfDeath);
        System.out.println("Akt zgonu został zarejestrowany.");
    }
}
