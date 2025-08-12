//Zachary Anderson
//8-12-25
//M1 Programming Assignment
//WaterHeatingCalculator java program


package anderson_WaterHeatingCalculator;

import java.util.Scanner;

public class WaterHeatingCalculator {
    public static void main(String[] args) {
        //Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        //Prompt user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = scanner.nextDouble();
        //Calculate energy needed using the formula
        //Q= waterMass * (finalTemperature-initialTemperature) * 4184
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is %.2f joules.%n", Q);

        scanner.close();
    }
}
