import java.util.Scanner;
/**
 * @Author: Hai Nguyen
 *
 * Use Scanner to take user input and return input
 * genomeName: String
 * numberOfGenes: double
 * numberOfChromosomes: int
 * NumberOfCells: int
 * Main method create 3 instances of HumanGenome
 */
public class GenomeInput {
    /**
     * Private class variable & methods within GenomeInput class
     * No other classes need to access these variables
     * hence they can be set as private static variable and methods
     */

     // Private variable. Scan is not going to get re-assigned so we can use `final`
    private static final Scanner scan = new Scanner(System.in);

    // Private classes
    private static String genomeName(){
        System.out.printf("What is the name of the Genome? ");
        return scan.nextLine();
    }

    private static double numberOfGenes(){
        System.out.printf("What is the number of genes? ");
        double value = scan.nextDouble();
        scan.nextLine(); // Clear the buffer
        return value;
    }

    private static int numberOfChromosomes(){
        System.out.printf("What is the number of Chromosomes? ");
        int value = scan.nextInt();
        scan.nextLine();
        return value;
    }

    private static int NumberOfCells(){
        System.out.printf("What is the number of cells (in trillion)? ");
        int value = scan.nextInt();
        scan.nextLine();
        return value;
    }

    public static void main (String [] args){
        // Instantiate each instance
        HumanGenome mickey = new HumanGenome(genomeName(), numberOfGenes(), numberOfChromosomes(), NumberOfCells());
        System.out.printf("%n Next Person %n");
        HumanGenome simba = new HumanGenome(genomeName(), numberOfGenes(), numberOfChromosomes(), NumberOfCells());
        System.out.printf("%n Next Person %n");
        HumanGenome goofy = new HumanGenome(genomeName(), numberOfGenes(), numberOfChromosomes(), NumberOfCells());
        // Each instance values
        mickey.print();
        simba.print();
        goofy.print();
    }
}

/**
 * OUTPUT:
 * What is the name of the Genome? Mickey
 * What is the number of genes? 20000
 * What is the number of Chromosomes? 46
 * What is the number of cells (in trillion)? 76
 *
 *  Next Person
 * What is the name of the Genome? Simba
 * What is the number of genes? 20000
 * What is the number of Chromosomes? 46
 * What is the number of cells (in trillion)? 120
 *
 *  Next Person
 * What is the name of the Genome? Goofy
 * What is the number of genes? 20000
 * What is the number of Chromosomes? 46
 * What is the number of cells (in trillion)? 75
 *
 * Name of property              Values
 * GenomeName                    Mickey
 * NumberofGenes                 20000
 * NumberofChromosome            46
 * NumberofCells (Trillion)      76
 *
 * Name of property              Values
 * GenomeName                    Simba
 * NumberofGenes                 20000
 * NumberofChromosome            46
 * NumberofCells (Trillion)      120
 *
 * Name of property              Values
 * GenomeName                    Goofy
 * NumberofGenes                 20000
 * NumberofChromosome            46
 * NumberofCells (Trillion)      75
 *
 * Process finished with exit code 0
 */
