public class RaggedArrayExample {
    public static void main(String[] args) {
        // Define the maximum size for our triangular array
        final int NMAX = 10;
        
        // Create a 2D array where each row will have a different length
        // This is what makes it a "ragged" or "jagged" array
        int[][] odds = new int[NMAX + 1][];
        
        // Allocate memory for each row with varying lengths
        // Each row n will have n+1 elements, creating a triangular pattern
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1];
        }
        
        // Fill the triangular array with calculated values
        // This uses a combination formula to calculate lottery odds
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                // Calculate combination: n choose k
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
        }
        
        // Print the ragged array in a formatted way
        // Each row is printed on a new line, with proper spacing
        System.out.println("Pascal's Triangle (Ragged Array Example):");
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd); // Format each number to 4 digits
            }
            System.out.println(); // Move to next line after each row
        }
    }
} 