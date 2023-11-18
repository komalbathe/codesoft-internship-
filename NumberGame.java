import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int lowerNumber = 1;
        int upperNumber = 175;
        int attemptsLimit = 15;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the My Number Game!");

        while (true) {
            int generatedNumber = random.nextInt(upperNumber - lowerNumber + 1) + lowerNumber;
            int attempts = 0;

            System.out.println("I have generated a number between " + lowerNumber + " and " 
				+ upperNumber + ".Can you guess it?");
            while (true) {
                System.out.print("Enter your guess number: ");
                int userGuess = scan.nextInt();
                attempts++;

                if (userGuess < lowerNumber || userGuess > upperNumber) {
                    System.out.println("Please guess within the valid range.");
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + 
					" attempts.");
                    score += attempts;
                    rounds++;

                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgain = scan.next().toLowerCase();
                    if (!playAgain.equals("yes")) {
                        System.out.println("Thank you for playing! Your total score is: " + score);
                        System.out.println("Total rounds played: " + rounds);
                        break;
                    }
                }

                if (attempts >= attemptsLimit) {
                    System.out.println("Sorry, you have reached themaximum number of attempts. The number was: "+ generatedNumber);
                    System.out.print("Do you want to play again? (yes/no): ");
                    String playAgain = scan.next().toLowerCase();
                    if (!playAgain.equals("yes")) {
                        System.out.println("Thank you for My number game playing!Your total score is: " + score);
                        System.out.println("You total rounds played: " + rounds);
                        break;
                    }
                }
            }
        }
    }
}
