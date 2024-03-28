import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter year of joining: ");
        int yearOfJoining = scanner.nextInt();

        int yearsOfService = currentYear - yearOfJoining;

        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have been awarded a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Congratulations! You have been awarded a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded.");
        }

        scanner.close();
    }
}
