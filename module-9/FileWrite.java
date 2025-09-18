import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        // Step 1: Create the file if it does not exist, and append 10 random numbers
        try (FileWriter writer = new FileWriter(file, true)) { // 'true' enables append mode
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(100); // Random integer between 0–99
                writer.write(randomNum + " ");
            }
            System.out.println("10 random numbers written/appended to 'data.file'.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // Step 2: Reopen and read the file
        System.out.println("\nContents of 'data.file':");
        System.out.println("Absolute path: " + file.getAbsolutePath());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String value = scanner.next();
                System.out.print(value + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            

        }
    }
}
