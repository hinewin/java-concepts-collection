import java.util.Arrays;


public class ArraysForLoop {
    /**
     * Create an array using for loop
     * @param num - Takes the size of the array
     * @return an array of num size
     */
    public static int [] CreateForLoopArray( int num){
        int [] arrayLoop = new int [num];
        for (int i = 0; i< arrayLoop.length; i++)
            arrayLoop[i] = i; // Fills array with numbers n to n.length
        return arrayLoop;
    }

    /**
     * Takes in an array and print out each element
     * using traditional for loop to print
     * @param a - The array that will be printed
     */
    public static void TraditionalLoopPrint( int [] a){
        System.out.println("Traditional Loop Print: \n");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    /**
     * Takes in an array and print out each element
     * using enhanced for loop to print
     * @param a - The array that will be printed
     */
    public static void EnhancedLoopPrint (int [] a ){
        System.out.println("Enhanced Loop Print: \n");
        for (int element: a)
            System.out.println(element);

    }

    public static void main (String [] args){
//        System.out.println(Arrays.toString(ForLoopArray(100)));
        TraditionalLoopPrint(CreateForLoopArray(5));
        EnhancedLoopPrint(CreateForLoopArray(7));
    }
}
