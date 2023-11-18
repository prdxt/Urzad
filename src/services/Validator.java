package services;

public class Validator {
    public static boolean validatePesel(String pesel) {
        return pesel.matches("\\d{11}");
    }
}
