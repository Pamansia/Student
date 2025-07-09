// PermitManager.java
import java.util.Scanner;

public class PermitManager {
    private static final String[] categories = {"Residential", "Visitor", "Commercial"};

    public void createPermit() {
        Scanner scanner = new Scanner(System.in);
        String permitNumber;

        while (true) {
            System.out.print("Enter Permit Number (6 alphanumeric characters): ");
            permitNumber = scanner.nextLine();

            if (PermitValidator.isValidPermit(permitNumber)) {
                break;
            } else {
                System.out.println("Invalid permit number format. Please try again.");
            }
        }

        System.out.println("Select a Category:");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        int choice = -1;
        while (choice < 1 || choice > categories.length) {
            System.out.print("Enter choice (1-" + categories.length + "): ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }

        String selectedCategory = categories[choice - 1];
        Permit permit = new Permit(permitNumber, selectedCategory);
        System.out.println(permit);
    }
}