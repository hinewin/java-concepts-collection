/**
 * Instance Fields
 * name : String
 * chemicalFormula: String
 * molarMass: float
 * density: float
 *
 * Methods
 * Constructor (name, chemicalFormula, molarMass, density)
 *
 * Getters
 * get_name.. get_density
 *
 * Setters
 * set_name.. set_density
 *
 * print()
 * - print all value of each property as separate lines
 */
package NucleidAcid;

public class NucleicAcid {
    private String name;
    private String chemicalFormula;
    private float molarMass;
    private float density;

    // Constructor
    NucleicAcid(String name, String chemicalFormula, float molarMass, float density){
        this.name = name;
        this.chemicalFormula = chemicalFormula;
        this.molarMass = molarMass;
        this.density = density;
    }

    // Getters
    public String getname(){
        return name;
    }
    public String getChemicalFormula(){
        return chemicalFormula;
    }
    public float getMolarMass(){
        return molarMass;
    }
    public float getDensity(){
        return density;
    }

    // Setters
    public void setName(String newName){
        name = newName;
    }
    public void setChemicalFormula(String newChemicalFormula){
        chemicalFormula = newChemicalFormula;
    }
    public void setMolarMass(float newMolarMass){
        molarMass = newMolarMass;
    }
    public void setDensity(float newDensity){
        density = newDensity;
    }

    // Print()
    public void print(){
        System.out.printf("%n%S%n", name);
        System.out.printf("%-25S%S%n","Chemical Formula:", chemicalFormula);
        System.out.printf("%-25S%.3f g/mol%n","Molar Mass:", molarMass);
        System.out.printf("%-25S%.3f g/cm3%n","Density:", density);
    }
}
