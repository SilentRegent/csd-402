import java.util.ArrayList;
import java.util.Scanner;

public class ZacharyArrayListTest {

    // Method to find the maximum value 
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop): ");

        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        // Call the max method and print the result
        Integer largest = max(numbers);
        System.out.println("The largest value in the ArrayList is: " + largest);

        
        scanner.close();
    }
}
