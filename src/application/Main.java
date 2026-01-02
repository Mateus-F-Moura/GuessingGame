package application;

import model.entities.GuessingGame;
import model.enums.Difficulty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            boolean again = true;
            while (again) {
                System.out.println();
                System.out.println("Please select the difficulty level:");
                System.out.println("1. Easy (10 chances)");
                System.out.println("2. Medium (5 chances)");
                System.out.println("3. Hard (3 chances)");

                System.out.println();
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                GuessingGame game = switch (choice) {
                    case 1 -> new GuessingGame(Difficulty.EASY);
                    case 2 -> new GuessingGame(Difficulty.MEDIUM);
                    case 3 -> new GuessingGame(Difficulty.HARD);
                    default -> throw new IllegalStateException("Unexpected value: " + choice);
                };

                System.out.println();
                System.out.println("Great! You have selected the " + game.getDifficulty() + " difficulty level.");
                System.out.println("Let's start the game!");

                System.out.println();
                boolean won = false;
                while (!game.isGameOver()) {
                    System.out.print("Enter your guess: ");
                    int guess = sc.nextInt();

                    if (game.makeGuess(guess)) {
                        won = true;

                        System.out.println("Congratulations! You guessed the correct number in " + game.getAttempts() + " attempts.");
                        break;
                    }
                }

                if (!won) {
                    System.out.println();
                    System.out.println("Game Over! You're out of chances.");
                    System.out.println("The secret number was: " + game.getSecretNum());
                }

                System.out.println();
                System.out.println(game);

                System.out.println();
                System.out.print("Wanna try again (true/false)? ");
                again = sc.nextBoolean();
            }

        }
    }
}