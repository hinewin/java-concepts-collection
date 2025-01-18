/*
// Variables
 - (double) fahrenheit
 - (double) centrigade

// Input
Take user's input as centrigade
 Scanner scan = new Scanner(System.in);

System.out.print("Enter a value: ");
celsius = scan.nextdouble();

Take user's input as fahrenheit
System.out.print("Enter a value: ");
fahrenheit = scan.nextdouble();

// Processing
method - celToFah
- Take 1 parameter (celsius)
- Convert centigrade to fahrenheit
- return 32 + Celsius (180.0/100.0)

Method fahToCel
- Take 1 parameter (fahrenheit)
- Convert fahrenheit to centigrade
- return (double fahrenheit - 32) * (5/9)


// Output

Please enter a temperature in Celsius: 0
0.00 Celsius is 32.00 in Fahrenheit
Please enter a temperature in Fahrenheit: -23
-23.00 Fahrenheit is -9.40 in Celsius
Process finished with exit code 0


 */


import java.util.Scanner;
public class tempConversion {
    /**
     *
     * Takes parameter Celsius
     * Return calculation from Celsius to Fahrenheit
     */
    public static double celToFah(double celsius){
        return 32d + celsius *(180.0d/100.0d);
    }

    /**
     *
     * Takes parameter Fahrenheit
     * Return calculation from Fahrenheit to Celsius
     */

    public static double fahToCel(double fahrenheit){
        return (fahrenheit - 32d) * (5d/9d);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for C -> F conversion
        System.out.printf("Please enter a temperature in Celsius: ");
        double celsius = scan.nextDouble();
        System.out.printf("%.2f Celsius is %.2f in Fahrenheit \n" , celsius,celToFah(celsius));

        // Prompt user for F -> C conversion
        System.out.printf("Please enter a temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        System.out.printf("%.2f Fahrenheit is %.2f in Celsius" , fahrenheit,celToFah(fahrenheit));

    }
}