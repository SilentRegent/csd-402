//Zachary Anderson
//9-3-25
//Mod5.2


public class ArrayLocator {

    // Locate largest element in double array
    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0, col = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] { row, col };
    }

    // Locate largest element in int array
    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0, col = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] { row, col };
    }

    // Locate smallest element in double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0, col = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] { row, col };
    }

    // Locate smallest element in int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0, col = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] { row, col };
    }

    // Main method to test everything
    public static void main(String[] args) {
        int[][] intArray = {
            { 3, 5, 9 },
            { 2, 8, 1 },
            { 6, 4, 7 }
        };

        double[][] doubleArray = {
            { 2.5, 7.3, 1.8 },
            { 9.6, 4.2, 3.3 },
            { 5.1, 6.7, 0.9 }
        };

        // Test int array
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Int Array:");
        System.out.println("Largest element at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest element at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");

        // Test double array
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("\nDouble Array:");
        System.out.println("Largest element at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest element at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}
