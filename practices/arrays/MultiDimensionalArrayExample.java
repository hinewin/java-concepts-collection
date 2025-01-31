public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        // Define constants for the number of years and interest rates
        final int NYEARS = 10; // Number of years to calculate balances for
        final int NRATES = 6;  // Number of different interest rates

        // Create a 2D array to store balances for each year and rate
        double[][] balances = new double[NYEARS][NRATES];

        // Initialize the first row with a starting balance of 10,000 for each rate
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000; // Starting balance for year 0
        }

        // Calculate balances for subsequent years
        for (int i = 1; i < balances.length; i++) { // Loop over each year starting from 1
            for (int j = 0; j < balances[i].length; j++) { // Loop over each interest rate
                double oldBalance = balances[i - 1][j]; // Get the balance from the previous year
                double interest = oldBalance * 0.10;    // Calculate interest (10% of the old balance)
                balances[i][j] = oldBalance + interest; // Update balance with interest
            }
        }

        // Print the table of balances
        for (double[] row : balances) { // Loop over each row (year)
            for (double value : row) {  // Loop over each value (balance for a rate)
                System.out.printf("%10.2f", value); // Print the balance formatted to 2 decimal places
            }
            // System.out.println(); // Move to the next line after printing all rates for a year
        }
    }
}