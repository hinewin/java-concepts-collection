import java.util.Scanner;

/**
 * This class will calculate a loan monthly payment based
 * on 3 parameters(PNR) from the user's input
 * principal(P), loan term(N), and interest rate (R)
 * @author: Hai Nguyen
 * @since: 1/22/25
 */

/** Program Design
 * Loan Amount: double originalPrincipal
 * Number of months: int numOfMonths
 * Total Payments: int totalPayments (numOfYears/12)
 * Monthly Interest Rate: float monthlyInterest
 * Monthly Payment: double monthlyPayment
 *
 * // Amortization Table
 * Payment #: int paymentCount
 * Interest: float interest
 * Principal: double principal
 * Balance: double balance
 *
* // Input
 * We need 3 numbers to plug into the formula (P , r, n) - originalPrincipal, monthlyInterest, numOfMonths
 * Scanner scan = new Scanner(System.in);
 *
 * System.out.printf("What is your loan amount? ");
 * double originalPrincipal =  scan.nextdouble();
 *
 * System.out.printf("What is your interest rate in percentage? ");
 * int monthlyInterest = (scan.nextFloat()/100)/12
 *
 * System.out.printf("What is the loan term (in years)? ");
 * int numOfMonths = (scan.nextInt())/12;
 *
* // Processing
 *
 * First we need a method to calculate monthly payment
 * public static double getMonthlyPayment (double originalPrincipal, float monthlyInterest, int totalPayments)
 * int monthlyPayment = (originalPrincipal *  monthlyInterest Math.pow(1 + monthlyInterest, totalPayments) /
 *                       Math.pow(1 + monthlyInterest, totalPayments) - 1
 *
 * Then we need to loop it through n number of years to display the amortization schedule
 *
 * for int i= 1 ; i<= numOfYears; i++;
 * float interest = monthlyInterest * balance;
 * principal = monthlyPayment - interest;
 * balance = balance - principal;
 *
 *
*  // Output
 *
* Print the header after process and before loop
 *  System.out.printf("\t%10s\t\t%-10s\t\t%10s\t\t%10s\n","Payment#","Interest", "Principal", "Balance");

* We will use a method to print out values(Within loop)
 *  System.out.printf("\t%5d\t\t%12f\t\t%10.2f\t\t%12.2f\n",360,(7.875/100), 908577.06, 900000.52);
 *
 */


public class ComputeLoan {

    /**
     * Calculates monthly payment from PNR
     * @param principal- The original loan amount
     * @param monthlyInterest - Annual interest/ 12
     * @param totalPayments - Amount of payment based of number of years*12
     * @return the monthly payment
     */
    public static double getMonthlyPayment (double principal, float monthlyInterest, int totalPayments){
        return (
                (principal *  monthlyInterest * Math.pow(1 + monthlyInterest, totalPayments)) /
                (Math.pow(1 + monthlyInterest, totalPayments)- 1)
        );
    }

    /**
     *  Prints out each line of the Amortization table
     * @param paymentCount - The payment count
     * @param newInterest - Amount paid to interest for that payment
     * @param newPrincipal - Amount paid to principal for that payment
     * @param newBalance - Balance after that payment
     */
    public static void printLine (int paymentCount, double newInterest, double newPrincipal, double newBalance){
        System.out.printf("\t%5d\t\t%17f\t\t%10.2f\t\t%12.2f\n", paymentCount, newInterest, newPrincipal, newBalance);
    }


    public static void main (String [] args){
        // Get user inputs for PNR
        Scanner scan = new Scanner(System.in);

        System.out.printf("What is your loan amount? ");
        double originalPrincipal =  scan.nextDouble();
        System.out.printf("Your principal is $%,.2f \n", originalPrincipal);

        System.out.printf("What is your interest rate in percentage? ");
        float monthlyInterest = (scan.nextFloat()/100)/12;
        System.out.printf("Your monthly interest is %.5f%% \n", monthlyInterest);

        System.out.printf("What is the loan term (in years)? ");
        int numOfMonths = (scan.nextInt())*12;
        System.out.printf("Your loan term takes %d months \n", numOfMonths);

        // Get Monthly Payment
        double monthlyPayment = getMonthlyPayment(originalPrincipal, monthlyInterest, numOfMonths);
        System.out.printf("Your monthly payment is going to be $%,.2f \n", monthlyPayment);

//         Print out headers for Amortization schedule
        System.out.printf("\n\t%5s\t\t%12s\t\t%10s\t\t%12s\n","Payment#","Interest", "Principal", "Balance");

        // Starts of loop to go through the loan term (n)
        double balance = originalPrincipal ;
        for (int payment = 1; payment <= numOfMonths; payment++) {

            double interest = monthlyInterest * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;

            printLine(payment, interest, principal, balance);
        }
    }
}


/**
 * OUTPUT
 * What is your loan amount? 10000
 * Your principal is $10,000.00
 * What is your interest rate in percentage? 7
 * Your monthly interest is 0.00583%
 * What is the loan term (in years)? 1
 * Your loan term takes 12 months
 * Your monthly payment is going to be $865.26
 *
 * 	Payment#		    Interest		 Principal		     Balance
 * 	    1		        58.333334		    806.93		     9193.07
 * 	    2		        53.626263		    811.63		     8381.44
 * 	    3		        48.891734		    816.37		     7565.07
 * 	    4		        44.129587		    821.13		     6743.94
 * 	    5		        39.339661		    825.92		     5918.02
 * 	    6		        34.521794		    830.74		     5087.28
 * 	    7		        29.675823		    835.58		     4251.70
 * 	    8		        24.801583		    840.46		     3411.24
 * 	    9		        19.898911		    845.36		     2565.88
 * 	   10		        14.967639		    850.29		     1715.59
 * 	   11		        10.007602		    855.25		      860.34
 * 	   12		         5.018631		    860.24		        0.10
 */
