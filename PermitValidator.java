// PermitValidator.java
public class PermitValidator {
    public static boolean isValidPermit(String permitNumber) {
        // Example validation: permit must be alphanumeric and 6 characters long
        return permitNumber != null && permitNumber.matches("[A-Za-z0-9]{6}");
    }
}