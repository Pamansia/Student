public class Permit {
    private final String permitNumber;
    private final String category;

    public Permit(String permitNumber, String category) {
        this.permitNumber = permitNumber;
        this.category = category;
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Permit Number: " + permitNumber + ", Category: " + category;
    }
}
