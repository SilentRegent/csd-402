//Zachary Anderson
//8/29/25
//Mod4.2

import java.util.Arrays;

public class AverageTest {

    // Overloaded method for short array
    public static short average(short[] array) {
        int sum = 0; // use int to prevent overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Overloaded method for int array
    public static int average(int[] array) {
        long sum = 0; // use long to prevent overflow
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Overloaded method for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Overloaded method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Arrays of different sizes
        short[] shortArray = {5, 10, 15};
        int[] intArray = {2, 4, 6, 8};
        long[] longArray = {1000, 2000, 3000, 4000, 5000};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display arrays and their averages
        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Average (short): " + average(shortArray));
        System.out.println();

        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Average (int): " + average(intArray));
        System.out.println();

        System.out.println("Long array: " + Arrays.toString(longArray));
        System.out.println("Average (long): " + average(longArray));
        System.out.println();

        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("Average (double): " + average(doubleArray));
    }
}
