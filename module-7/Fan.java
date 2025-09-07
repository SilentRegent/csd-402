/*
 * Zachary Anderson
 * 9-6-25
 * M7 Assignment
 */
public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public int getSpeed() {
        return this.speed;  // added 'this'
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;  // added 'this'
        } else {
            System.out.println("Invalid speed value.");
        }
    }

    public boolean isOn() {
        return this.on;  // added 'this'
    }

    public void setOn(boolean on) {
        this.on = on;  // added 'this'
    }

    public double getRadius() {
        return this.radius;  // added 'this'
    }

    public void setRadius(double radius) {
        this.radius = radius;  // added 'this'
    }

    public String getColor() {
        return this.color;  // added 'this'
    }

    public void setColor(String color) {
        this.color = color;  // added 'this'
    }

    // toString method
    @Override
    public String toString() {
        if (this.on) {  // added 'this'
            return "Fan is ON [speed=" + this.speed + ", radius=" + this.radius + ", color=" + this.color + "]";
        } else {
            return "Fan is OFF [radius=" + this.radius + ", color=" + this.color + "]";
        }
    }
}
