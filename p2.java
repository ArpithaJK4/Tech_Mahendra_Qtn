import java.util.Scanner;

public class ReverseNumberParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the position: ");
        int position = scanner.nextInt();

        String numStr = Integer.toString(number);

        if (position < 1 || position > numStr.length()) {
            System.out.println("Invalid position.");
            return;
        }

        String leftPart = new StringBuilder(numStr.substring(0, position)).reverse().toString();
        String rightPart = new StringBuilder(numStr.substring(position)).reverse().toString();

        System.out.println("Transformed number: " + Integer.parseInt(rightPart + leftPart));
    }
}
