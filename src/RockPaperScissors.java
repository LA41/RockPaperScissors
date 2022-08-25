import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //whole game is in a while loop, so at the end user chooses if he/she wants to play again
        while (true) {
            //generate computer's move
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            //take input from a user
            String userMove;
            while (true) {
                System.out.println("Enter your move (r, p or s): ");
                userMove = sc.nextLine();
                if (userMove.equals("r") || userMove.equals("p") || userMove.equals("s"))
                    break;
                else
                    System.out.println("Invalid move");
            }
            System.out.println("Computer played: " + computerMove);
            
            //compare user's and computer's move
            if (userMove.equals(computerMove))
                System.out.println("Tie!");
            else if (userMove.equals("r")) {
                if (computerMove.equals("p"))
                    System.out.println("You lost :(");
                else
                    System.out.println("You win!");
            } else if (userMove.equals("p")) {
                if (computerMove.equals("s"))
                    System.out.println("You lost :(");
                else
                    System.out.println("You win!");
            } else if (userMove.equals("s")) {
                if (computerMove.equals("r"))
                    System.out.println("You lost :(");
                else
                    System.out.println("You win!");
            }
            
            //ask if wanna play again
            System.out.println("Wanna play again? (y/n)");
            String playAgain = sc.nextLine();
            if (!playAgain.equals("y"))
                break;
        }
        sc.close();
    }
}
