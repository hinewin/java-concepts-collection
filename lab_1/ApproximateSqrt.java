import java.util.Scanner;

/**
 * Approximate the square root using Babylonian method
 *
 * @author : Hai Nguyen
 * @since : 1/22/25
 */

/** PROGRAM DESIGN
 *
 * // Variables
 *  double firstGuess
 *  double nextGuess
 *  double lastGuess
 *  double squareRootOf
 *  double ACCURACY = 0.0001
 *
 * // Input
 * We will ask the user what number to find its square root for
 * We will ask for the user first guess
 **
 * // Processing
 * babylonian Method that return the next guess
 * public static double babylonian( double n, double Guess);
 *  return((guess + n) / guess) / 2
 *
 * sqrt(long n) method
 * We will set the initial guess from user input
 *
 * we will do a loop until nextGuess - lastGuess <= 0.0001 (ACCURACY)
 * Then nextGuess is the approximate square root of n
 * Else, nextGuess = lastGuess
 *
 * lastGuess = firstGuess
 *  while (True){
 *     nextGuess = babylonian(n, lastGuess);
 *     if nextGuess - lastGuess <= ACCURACY;
 *     system.out.printf("The approximate square root of %f.2 is, nextguess)
 *     break;
 *     nextGuess = lastGuess;

 * }
 *
 * // Printing
 * system.out.printf("The approximate square root of %f.2 is, nextguess)
 */


/**
 * Calculate next guess using Babylonian method
 * @param n - The number that the program will try to find the square root for
 * @param firstGuess - The guess of that squareroot
 * @return - Return the next Guess to try
 */

public static double sqrt (long n, double firstGuess){

    double ACCURACY = 0.0001;
    double lastGuess = firstGuess;
    double nextGuess;

    while (true){
        nextGuess = (lastGuess +n / lastGuess) /2;
        if (nextGuess - lastGuess <= ACCURACY) {
            return nextGuess;
        }
        lastGuess = nextGuess;
    }
}

public void main() {
    Scanner scan = new Scanner(System.in);

    System.out.print ("Enter the number you want to find a square root for: ");
    long n = scan.nextLong();
    System.out.print ("What is your first guess? ");
    double firstGuess = scan.nextDouble();

    double result = sqrt(n, firstGuess);
    System.out.printf("The approximate square of %d is %.5f", n, result);
}

/**
 * OUTPUT
 *
 * Enter the number you want to find a square root for: 3481
 * What is your first guess? 30
 * The approximate square of 3481 is 60.34536
 * Process finished with exit code 0
 */