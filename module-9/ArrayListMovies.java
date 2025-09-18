import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMovies {
    public static void main(String[] args) {
        // Create an ArrayList with at least 10 Strings
        ArrayList<String> items = new ArrayList<>();
        items.add("Starship Troopers");
        items.add("Harry Potter");
        items.add("Percy Jackson and The Olympians");
        items.add("Aliens");
        items.add("The Terminator");
        items.add("Avengers: Endgame");
        items.add("Underworld");
        items.add("Silence of the Lambs");
        items.add("American Sniper");
        items.add("The Lord of the Rings");

        // Print all elements using for-each loop
        System.out.println("List of favorite movies:");
        for (String movie : items) {
            System.out.println(movie);
        }

        // Ask user which element they'd like to see again
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("\nEnter the index of the movie you'd like to see again (0 to "
                    + (items.size() - 1) + "), or 'q' to quit: ");

            userInput = scanner.nextLine();

            // Exit condition
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Exiting program. See Ya!");
                break;
            }

            try {
                // Autoboxing from String to Integer
                Integer indexObject = Integer.valueOf(userInput);

                // Auto-unboxing from Integer to int
                int index = indexObject;

                // Attempt to access the element
                System.out.println("You selected: " + items.get(index));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("You Have Chosen, Poorly");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a valid integer index or 'q' to quit.");
            }
        }

        scanner.close();
    }
}
