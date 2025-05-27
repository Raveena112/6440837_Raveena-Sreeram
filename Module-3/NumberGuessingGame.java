import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess a number (1-100): ");
            guess = scanner.nextInt();
            if (guess > numberToGuess)
                System.out.println("Too high!");
            else if (guess < numberToGuess)
                System.out.println("Too low!");
        } while (guess != numberToGuess);
        System.out.println("Correct! The number was " + numberToGuess);
        scanner.close();
    }
}
