import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the position: ");
        int position = scanner.nextInt();

        // Convert the number to a string
        String numStr = Integer.toString(number);

        // Validate the position
        if (position < 1 || position > numStr.length()) {
            System.out.println("Invalid position.");
            return;
        }

        // Split the number at the specified position
        String leftPart = numStr.substring(0, position);  // Digits before position
        String rightPart = numStr.substring(position);    // Digits after position

        // Reverse both parts
        String reversedLeftPart = new StringBuilder(leftPart).toString();
        String reversedRightPart = new StringBuilder(rightPart).toString();

        // Concatenate reversed parts in reverse order (right first, then left)
        String transformed = reversedRightPart + reversedLeftPart;

        // Output the transformed number
        System.out.println("Transformed number: " + transformed);
    }
}
