/*
 * Zachary Anderson
 * 9-3-25
 * M6 Assignment
 */
public class FanTest {
    public static void main(String[] args) {
        // Fan using default constructor
        Fan fan1 = new Fan();

        // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Print initial states
        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);

        // Update Fan 1
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("green");

        // Print updated state
        System.out.println("Updated Fan 1: " + fan1);
    }
}