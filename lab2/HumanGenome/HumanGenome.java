/**
 * @Author: Hai Nguyen
 * Variables
* Class Properties:
*   genome_name : String
*   num_of_genes : double
*   num_of_chromosomes: int
*   num_of_cells: int ( In trillion)
* Methods:
*  setter
 *  - Change value of each instance field
 * getter
 * - Return each property value
 * print()
*  - print all value of all properties
 *  - Table ?
 *
 */
public class HumanGenome {
    /**
     * Instance Fields
     */
    private String genome_name;
    private Double num_of_genes;
    private int num_of_chromosomes;
    private int num_of_cells;

    /**
     * Constructor
     * Set up a HumanGenome based from their properties
     */

    HumanGenome(String genome_name, Double num_of_genes, int num_of_chromosomes, int num_of_cells){
        this.genome_name = genome_name;
        this.num_of_genes = num_of_genes;
        this.num_of_chromosomes = num_of_chromosomes;
        this.num_of_cells = num_of_cells;
    }

    /**
     * Getter
     */
    public String getGenomeName() {
        return genome_name;
    }
    public Double getNumOfGenes() {
        return num_of_genes;
    }
    public int getNumOfChromosomes() {
        return num_of_chromosomes;
    }
    public int getNumOfCells() {
        return num_of_cells;
    }

    /**
     * Setter
     */
    public void setGenomeName(String genomeName) {
        this.genome_name = genomeName;
    }
    public void setNumOfGenes(Double numOfGenes) {
        this.num_of_genes = numOfGenes;
    }
    public void setNumOfChromosomes(int numOfChromosomes) {
        this.num_of_chromosomes = numOfChromosomes;
    }
    public void setNumOfCells(int numOfCells) {
        this.num_of_cells = numOfCells;
    }

    /**
     * Print
     */
    public void print() {
        // Header Rows
        System.out.printf("%n%-30s%-30s%n", "Name of property", "Values");
        // Value Rows
        System.out.printf("%-30s%-30s%n", "GenomeName", genome_name);
        System.out.printf("%-30s%-30s%n", "NumberofGenes", num_of_genes);
        System.out.printf("%-30s%-30d%n", "NumberofChromosome", num_of_chromosomes);
        System.out.printf("%-30s%-30d%n", "NumberofCells (Trillion)", num_of_cells);
    }
}
