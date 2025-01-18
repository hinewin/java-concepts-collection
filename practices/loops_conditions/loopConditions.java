public class loopConditions {
    /**
     * Execute something 5 times
     */
    public static void print5Times(){
        for (int i = 0; i<5; i++){
            System.out.println("Print this 5x");
        }
    }

    /**
     * Print out counter
     */
    public static void iCounter(){
        for (int i = 4; i <10 ; i++){
            System.out.printf("Counter: i = 2%d\t\t", i);
        }
    }

    /**
     Access an array index and element
     **/
    public static void accessArray(int[] array) {
        // Access an array index and element
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Index: %d\t Element: %d\n", i, array[i]);
        }
    }

    public static void main(String[] args) {
        // Execute something in multiple times
        print5Times();

        // Print out counter
        iCounter();
        // Print all elements in an array
        System.out.println();

        // Access an Array
        int[] grades = {95, 80, 100, 99};
        accessArray(grades);
    }
}

/*
OUTPUT:
Print this 5x
Print this 5x
Print this 5x
Print this 5x
Print this 5x
Counter: i = 24		Counter: i = 25		Counter: i = 26		Counter: i = 27		Counter: i = 28		Counter: i = 29
Index: 0	 Element: 95
Index: 1	 Element: 80
Index: 2	 Element: 100
Index: 3	 Element: 99
 */