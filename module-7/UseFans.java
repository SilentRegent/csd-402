/*
 * Zachary Anderson
 * 9/6/25
 * M7 Assignment
 */
import java.util.*;

public class UseFans {

    // Method to display a single Fan (without using toString)
    public static void displayFan(Fan f) {
        System.out.println("Speed: " + f.getSpeed());
        System.out.println("On: " + f.isOn());
        System.out.println("Radius: " + f.getRadius());
        System.out.println("Color: " + f.getColor());
        System.out.println();
    }

    // Method to display all Fans in a collection
    public static void displayFans(Collection<Fan> fans) {
        for (Fan f : fans) {
            displayFan(f); // Reuse the single-fan display method
        }
    }

    public static void main(String[] args) {
        // Create a collection of Fans
        List<Fan> fans = new ArrayList<>();
        fans.add(new Fan(Fan.FAST, true, 12, "Red"));
        fans.add(new Fan(Fan.MEDIUM, false, 8, "Blue"));
        fans.add(new Fan(Fan.SLOW, true, 10, "Green"));

        // Display all Fans
        System.out.println("Displaying all Fans in the collection:");
        displayFans(fans);

        // Display a single Fan
        System.out.println("Displaying a single Fan:");
        displayFan(fans.get(0)); // Display first fan in the list
    }
}
