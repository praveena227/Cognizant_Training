package cognizant.qea25qe028;

import java.util.*;
public class RockPaperScissor {
	

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain= " ";

        do {
            System.out.println("Player 1: Enter rock, paper, or scissors:");
            String player1 = scanner.next();

            System.out.println("Player 2: Enter rock, paper, or scissors:");
            String player2 = scanner.next();

            if (player1.equals(player2)) {
                System.out.println("It's a tie");
            } else if ((player1.equals("rock") && player2.equals("scissors")) ||
                       (player1.equals("scissors") && player2.equals("paper")) ||
                       (player1.equals("paper") && player2.equals("rock"))) {
                System.out.println("Player 1 wins!");
            } else if ((player2.equals("rock") && player1.equals("scissors")) ||
                       (player2.equals("scissors") && player1.equals("paper")) ||
                       (player2.equals("paper") && player1.equals("rock"))) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("Invalid input.");
            }

            System.out.println("Do you want to play another round?");
            playAgain = scanner.next();	
            		
        } while (playAgain.equals("yes"));

        scanner.close();
    }
}



