AlGORITHM FOR MY CODE --

Generate a random number
Ask the user to guess the number
Compare the guess with the random number
Tell the user:
Correct 🎉
OR too high / too low ❌

  PROGRAM CODE --
  import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1; // 1 to 100

        System.out.println("Guess the Number Game");
        System.out.print("Enter your guess (1 to 100): ");
        int userGuess = sc.nextInt();

        if (userGuess == randomNumber) {
            System.out.println("🎉 Congratulations! You guessed it right.");
        } else if (userGuess > randomNumber) {
            System.out.println("Too high! The number was: " + randomNumber);
        } else {
            System.out.println("Too low! The number was: " + randomNumber);
        }

        sc.close();
    }
}
