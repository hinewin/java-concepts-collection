import java.util.Arrays;


public class ArraysForLoop {
    public static int [] ForLoopArray( int num){
        int [] arrayLoop = new int [num];
        for (int i = 0; i< arrayLoop.length; i++)
            arrayLoop[i] = i; // Fills array with numbers n to n.length
        return arrayLoop;
    }

    public static void TraditionalLoopPrint( int [] a){
        System.out.println("Traditional Loop Print: \n");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void EnhancedLoopPrint (int [] a ){
        System.out.println("Enhanced Loop Print: \n");
        for (int element: a)
            System.out.println(element);

    }

    public static void main (String [] args){
//        System.out.println(Arrays.toString(ForLoopArray(100)));
        TraditionalLoopPrint(ForLoopArray(5));
        EnhancedLoopPrint(ForLoopArray(7));
    }
}
