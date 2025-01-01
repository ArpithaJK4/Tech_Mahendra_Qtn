import java.util.Scanner;

public class NegativeTemperatureCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of products
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        // Input: Temperatures for each product
        System.out.print("Enter the temperatures: ");
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextInt();
        }

        // Count negative temperatures
        int negativeCount = 0;
        for (int temp : temperatures) {
            if (temp < 0) {
                negativeCount++;
            }
        }

        // Output: Number of products requiring negative temperature storage
        System.out.println("Number of products with negative temperature requirement: " + negativeCount);

        scanner.close();
    }
}
