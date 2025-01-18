/* Design & Pseudo Code
 *
 * Variables
 * (int) Store quantity for each product (quantityTV, quantityVCR,
 *  quantityRC, quantityCD, quantityTR)
 * (float) Set unit prices as constants, (TV_UNIT_PRICE, VCR_UNIT_PRICE,
 *  RC_UNIT_PRICE, CD_PLAYER_UNIT_PRICE, TR_UNIT_PRICE)
 * (float) Set total price for each item (totalPriceTV, totalPriceVCR,
 * totalPriceRC, totalPriceCD, totalPriceTR)
 *
 * (float) Set subtotal as a float (subTotal)
 * (float) Set sales tax as a constant, (saleTax) as a float of .0825
 * (float) Set total
 *
 * Inputs

 * Methods = countItem, calSubtotal, calTotal
 *
 * Method countItem() prints ("how many $unit were sold? ") and
 * return the quantity for each product from scanner
 * takes 1 parameter for this method (unitName)
 *
 * public static int countItem(String unitName){
 *  Initialize Scanner as scan
 *  System.out.printf("How many unitName were sold? ");
 *      return scan.readInt();
 * }
 *
 *
 * Method totalPriceItem() calculates the total price of each item by computing
 * quantityItem * ITEM_PRICE
 *
 *
 *Method calTotal(), calculates the subtotal with tax. Formular: subtotal * (1+ saleTax)
 *
 *  public static float calTotal(subTotal,tax){
 *     return subtotal * (1+tax)
 * }
 *
 * Method to print out all line item
 *     public static void printValues(int qty, String Description, float unitPrice, float totalPrice){
        System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n",qty,Description, unitPrice, totalPrice);
    }
    *
    *
 *Processing
 * Fetch value for each unit quantity
 *In main method, we will use countItem() on each variable
 *
 * public static void main(String[] args){
 *      int quantityTV = countItem("TV's")
 *      int quantityVCR = countItem("VCR's")
 *      int quantityRC = countItem("Remote Controller's")
 *      int quantityCD = countItem("CD Player's")
 *      int quantityTR = countItem("Tape Recorde's")
 * }
 *
 * Calculate each item total price
 *       float totalPriceTV = calTotalPriceItem(quantityTV, TV_UNIT_PRICE);
 *       float totalPriceVCR = calTotalPriceItem(quantityVCR, VCR_UNIT_PRICE);
 *       float totalPriceRC = calTotalPriceItem(quantityRC, RC_UNIT_PRICE);
 *       float totalPriceCD = calTotalPriceItem(quantityCD, CD_PLAYER_UNIT_PRICE);
 *       float totalPriceTR = calTotalPriceItem(quantityTR, TR_UNIT_PRICE);
 *
 *   // Calculate subtotal, sum of all totalprice
 *              float subTotal = (
 *               totalPriceTV + totalPriceVCR + totalPriceRC + totalPriceCD + totalPriceTR
 *               );
 *
 *   // Calculate total
 *      float totalPrice= calTotal(subTotal, tax);
 *
 * Print out headers
 * System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","#","Description", "Unit Price", "Total Price");
 * Print out line items
 *    public static void printValues(int qty, String Description, float unitPrice, float totalPrice){
        System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n",qty,Description, unitPrice, totalPrice);
 *   }
 *
 * // OUTPUT
 *
How many TV's were sold? 4
How many VCR's were sold? 6
How many Remote Controller's were sold? 3
How many CD Player's were sold? 2
How many Tape Recorder's were sold? 1
	 #	Description                   		     Unit Price		    Total Price
	 4	                    Television		$         400.00		$        1600.00
	 6	                           VCR		$         220.00		$        1320.00
	 3	             Remote Controller		$          35.20		$         105.60
	 4	                     CD Player		$         300.00		$         600.00
	 4	                 Tape Recorder		$         150.00		$         150.00

 	SUBTOTAL $3775.60
	TAX 8.25%
	TOTAL $4087.09
 *
 */


import java.util.Scanner;
public class billing {

    // Create Methods
    /**
     * Take item name as a parameter
     * Prompt user how many unit were sold for that item
     * Return the quantity that was sold for that item
     */

    public static int countItem(String unitName){
        Scanner scan = new Scanner(System.in); // Note2self: Is there a more efficient way of initializing this each time the method is invoked?
        System.out.printf("How many %s's were sold? " , unitName);
        return scan.nextInt();
    }

    /**
     * Calculate the total cost per sold item
     * Item Total Cost = quantity * unitCost
     * Return the totalPriceItem
     */

    public static float calTotalPriceItem(int quantity, float unitCost){
        return quantity * unitCost;
    }

    /**
     * Print out receipt value with 4 parameters
     * QTY  DESCRIPTION  UNIT PRICE  TOTAL PRICE
     * Print each value out in that format
     */

    public static void printValues(int qty, String Description, float unitPrice, float totalPrice){
        System.out.printf("\t%2d\t%30s\t\t$%15.2f\t\t$%15.2f\n",qty,Description, unitPrice, totalPrice);
    }

    /**
     * Calculate the total cost with formula
     * Total Cost = subTotal * (1 + TAX)
     * Return the totalCost
     */

    public static float calTotal(float subTotal, float Tax){
        return subTotal * (1+Tax);
    }


    // Main method
    public static void main(String[] args) {

        // Set constants
        float TV_UNIT_PRICE = 400.00f;
        float VCR_UNIT_PRICE = 220.00f;
        float RC_UNIT_PRICE = 35.20f;
        float CD_PLAYER_UNIT_PRICE = 300.00f;
        float TR_UNIT_PRICE = 150.00f;
        float SALES_TAX = .0825f;

        // Fetch quantity for each item
        int quantityTV = countItem("TV");
        int quantityVCR = countItem("VCR");
        int quantityRC = countItem("Remote Controller");
        int quantityCD = countItem("CD Player");
        int quantityTR = countItem("Tape Recorder");


        // Calculate each item total price
        float totalPriceTV = calTotalPriceItem(quantityTV, TV_UNIT_PRICE);
        float totalPriceVCR = calTotalPriceItem(quantityVCR, VCR_UNIT_PRICE);
        float totalPriceRC = calTotalPriceItem(quantityRC, RC_UNIT_PRICE);
        float totalPriceCD = calTotalPriceItem(quantityCD, CD_PLAYER_UNIT_PRICE);
        float totalPriceTR = calTotalPriceItem(quantityTR, TR_UNIT_PRICE);


        // Calculate subtotal
        float subTotal = (
                totalPriceTV + totalPriceVCR + totalPriceRC + totalPriceCD + totalPriceTR
        );

        // Calculate Final Cost
        float total = calTotal(subTotal, SALES_TAX);

        // Print Headers
        System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","#","Description", "Unit Price", "Total Price");

        // Print Receipt Values
        printValues(quantityTV,"Television",TV_UNIT_PRICE, totalPriceTV );
        printValues(quantityVCR,"VCR",VCR_UNIT_PRICE, totalPriceVCR );
        printValues(quantityRC,"Remote Controller",RC_UNIT_PRICE, totalPriceRC );
        printValues(quantityTV,"CD Player",CD_PLAYER_UNIT_PRICE, totalPriceCD );
        printValues(quantityTV,"Tape Recorder",TR_UNIT_PRICE, totalPriceTR );

        System.out.printf("\n \tSUBTOTAL $%.2f\n\tTAX %.2f%%\n\tTOTAL $%.2f", subTotal,(SALES_TAX* 100),total);

    }
}
