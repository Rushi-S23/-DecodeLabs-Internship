import java.util.Random;
import java.util.Scanner;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char choice;

        do {

            int number = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 7;
            boolean win = false;

            System.out.println("\n=== NUMBER GUESSING GAME ===");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have only 7 attempts");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");

                if (sc.hasNextInt()) {

                    guess = sc.nextInt();
                    attempts++;

                    if (guess > number) {
                        System.out.println("Too High!");
                    }
                    else if (guess < number) {
                        System.out.println("Too Low!");
                    }
                    else {
                        System.out.println("Correct! You Won.");
                        win = true;
                        break;
                    }

                    System.out.println("Attempts Left: "
                            + (maxAttempts - attempts));

                } else {
                    System.out.println("Please enter numbers only!");
                    sc.next(); // remove invalid input
                }
            }

            if (!win) {
                System.out.println("\nGame Over!");
                System.out.println("Correct Number was: " + number);
            }

            int score = maxAttempts - attempts;
            System.out.println("Your Score: " + score);

            System.out.print("\nPlay Again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank You!");
        sc.close();
    }
}