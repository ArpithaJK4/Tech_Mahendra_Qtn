import java.util.Scanner;

public class DiscountEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of products
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        // Input: Product values
        System.out.print("Enter the product values: ");
        int[] productValues = new int[n];
        for (int i = 0; i < n; i++) {
            productValues[i] = scanner.nextInt();
        }

        // Input: Threshold value for discount
        System.out.print("Enter the threshold value for discount: ");
        int threshold = scanner.nextInt();

        // Logic to count eligible products
        int discountCount = 0;
        System.out.print("Products eligible for discount are of types: ");
        for (int i = 0; i < n; i++) {
            if (productValues[i] >= threshold) {
                discountCount++;
                System.out.print(i + " "); // Print product type index
            }
        }

        // Output the result
        System.out.println("\nNumber of products eligible for discount: " + discountCount);

        scanner.close();
    }
}
