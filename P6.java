import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Employee Rating Point (ERP)
        System.out.print("Enter the Employee Rating Point (ERP): ");
        int erp = scanner.nextInt();

        // Determine Employee Rating Grade (ERG)
        char erg;
        if (erp >= 30 && erp <= 50) {
            erg = 'D';
        } else if (erp >= 51 && erp <= 60) {
            erg = 'C';
        } else if (erp >= 61 && erp <= 80) {
            erg = 'B';
        } else if (erp >= 81 && erp <= 100) {
            erg = 'A';
        } else {
            System.out.println("Invalid ERP! Please enter a value between 30 and 100.");
            scanner.close();
            return;
        }

        // Output the Employee Rating Grade (ERG)
        System.out.println("Employee Rating Grade (ERG): " + erg);

        scanner.close();
    }
}
