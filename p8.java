public class Main {

    public static void main(String[] args) {
        String input = "alphxxdida";  // Input string
        
        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Initialize a counter for positions that remain the samegggggg                                           ggg                                                     bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb                                    
        int samePositionCount = 0;

        // Compare each character in the original string with the reversed string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == reversed.charAt(i)) {
                samePositionCount++;
            }
        }

        // Output the result
        System.out.println("Output: " + samePositionCount);
    }
}
                                                    
