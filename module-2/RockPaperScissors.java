//Zachary Anderson
//8-22-25
//Module2.2 Programming Assignment
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
       
        
        
        // Prompt User 
        System.out.println("Welcome! This is a game of Rock,Paper, and Scissors");
        while(playAgain) {
             //Random computer selection
            int computerChoice = random.nextInt(3)+1;
        
            System.out.println("1 = Rock");
            System.out.println("2 = Paper");
            System.out.println("3 = Scissors");
            System.out.println("Choose one!");
            int userChoice = scanner.nextInt();
        
            //Show what each part had chosen
            System.out.println("You chose: " + toWord(userChoice));
            System.out.println("Computer chose: " + toWord(computerChoice));
        
            if (userChoice == computerChoice) {
                System.out.println("The match was a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
                System.out.println("Winner, Winner, Chicken Dinner!"); 
            } else {
                System.out.println("I regret to inform you, the machines have won!");
            }
            
            //Prompt user for rematch
            System.out.print("Care for another game? (y/n): ");
            String answer = scanner.next().toLowerCase();
            
            if (!answer.equals("y")) {
                playAgain = false;
                System.out.println("Okay, maybe next time!");
            }
        }
        
        scanner.close();
     }
     private static String toWord(int choice) {
         switch (choice) {
             case 1: return "Rock";
             case 2: return "Paper";
             case 3: return "Scissors";
             default: return "You have chosen, poorly";
             
         }
    }
    
}
