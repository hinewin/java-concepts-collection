/**
 * Instantiate a NucleidAcid object from user input
 */

package NucleidAcid;
import java.util.Scanner;

public class GenoNucleicAcid {
    private static final Scanner scan = new Scanner(System.in);

    // Methods to take each parameter
    public static String name(){
        System.out.printf("What is the name of this Nucleic Acid? ");
        return scan.nextLine();
    }

    public static String chemicalFormula(){
        System.out.printf("What is the formula of this Nucleic Acid? ");
        return scan.nextLine();
    }

    public static float molarMass(){
        System.out.printf("What is its molar mass? ");
        // Float molarMass = scan.nextFloat();
        return scan.nextFloat();
    }

    public static float density(){
        System.out.printf("What is its density? ");
        return scan.nextFloat();
    }

    // Main method to instatiate NucleicAcid

    public static void main (String [] args){
        NucleicAcid newNucleicAcid = new NucleicAcid(name(), chemicalFormula(), molarMass(), density());
        newNucleicAcid.print();
    }
}

/**
 * OUTPUT:
 * What is the name of this Nucleic Acid? Cytosine
What is the formula of this Nucleic Acid? C4H5N30
What is its molar mass? 111.10
What is its density? 1.55

CYTOSINE
CHEMICAL FORMULA:        C4H5N30
MOLAR MASS:              111.100 g/mol
DENSITY:                 1.550 g/cm3
 */
