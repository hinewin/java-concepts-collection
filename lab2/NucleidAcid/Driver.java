/**
 * @Author: Hai Nguyen
 * Instantiate the Nucleic Acids classs with passed in parameters
 */
package NucleidAcid;

public class Driver {
    public static void main (String [] args){
        // Store each predefined value in an array
        NucleicAcid [] nucleicAcids ={
            new NucleicAcid("Cytosine","C4H5N3O", 111.10F, 1.55F),
            new NucleicAcid("Adenine","C5H5N5", 135.13F, 1.6F),
            new NucleicAcid("Guanine","C5H5N5O", 151.13F, 2.200F),
            new NucleicAcid("Thymine","C5H6N2O2", 126.115F, 1.223F),
            new NucleicAcid("Uracil","C4H4N2O2", 112.08676F, 1.32F)
        };

        // Itterate through each object and print their values
    for (NucleicAcid nucleid : nucleicAcids){
        nucleid.print();
        System.out.printf("");
        }
    }
}

/**
 * OUTPUT:
 * CYTOSINE
 * CHEMICAL FORMULA:        C4H5N30
 * MOLAR MASS:              111.100 g/mol
 * DENSITY:                 1.550 g/cm3
 *
 * ADENINE
 * CHEMICAL FORMULA:        C5H5N5
 * MOLAR MASS:              135.130 g/mol
 * DENSITY:                 1.600 g/cm3
 *
 * GUANINE
 * CHEMICAL FORMULA:        C5H5N5O
 * MOLAR MASS:              151.130 g/mol
 * DENSITY:                 2.200 g/cm3
 *
 * THYMINE
 * CHEMICAL FORMULA:        C5H6N2O2
 * MOLAR MASS:              126.115 g/mol
 * DENSITY:                 1.223 g/cm3
 *
 * URACIL
 * CHEMICAL FORMULA:        C4H4N2O2
 * MOLAR MASS:              112.087 g/mol
 * DENSITY:                 1.320 g/cm3
 */
