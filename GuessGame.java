import java.util.*;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomNum = new Random();
        int min = 1;
        int max = 100;
        System.out.println("Enter the number of rounds");
        int maxRounds = sc.nextInt();
        int maxattempts = 5;
        int Totalscore = 0;
        int round = 1;

        while (round <= maxRounds) {
            int secret = randomNum.nextInt(max - min + 1) + min;
            System.out.println("Round " + round);

            int attempt = 0;
            while (attempt < maxattempts) {
                System.out.println("Enter the Number");
                int number = sc.nextInt();

                if (number == secret) {
                    System.out.println("Congratulations, Your Guess Is Correct");
                    int score = 10;
                    Totalscore += score;
                    System.out.println("Round " + round + " score: " + score);
                    break;
                } else if (number + 10 > secret && number - 10 < secret) {
                    System.out.println("Number is in your range of 10");
                } else if (number - 10 < secret) {
                    System.out.println("Your guess is lower than number");
                } else {
                    System.out.println("Your guess is higher than number");
                }
                attempt++;
                if (attempt == maxattempts) {
                    System.out.println("Sorry, you have used all your attempts");
                    System.out.println("The secret number was " + secret);
                }

            }
            round++;
        }
        System.out.println("Game Over");
        System.out.println("Total Score: " + Totalscore);

    }
}