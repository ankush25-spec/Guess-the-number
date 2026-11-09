
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your Difficulty level");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        int chosenNumber = (int) (Math.random() * 100 + 1);
        int userNumber = 0;
        int totalAttempt = 0;
        int level = sc.nextInt();
        boolean isValid = false;
        switch (level) {
            case 1: {
                totalAttempt = 9;
                isValid = true;
                System.out.println("You have 9 moves");
                break;
            }
            case 2: {
                totalAttempt = 7;
                isValid = true;
                System.out.println("You have 7 moves");
                break;
            }
            case 3: {
                totalAttempt = 5;
                isValid = true;
                System.out.println("You have 5 moves");
                break;
            }
            default: {
                System.out.println("Invalid Input");
            }
        }
        boolean isWon = false;
        if (isValid) {
            do {
                System.out.println("Type any number");
                totalAttempt--;
                userNumber = sc.nextInt();
                if (userNumber == chosenNumber) {
                    System.out.println("BULLSEYE... CORRECT NUMBER");
                    isWon = true;
                    break;
                } else if (userNumber > chosenNumber) {
                    System.out.println("Guess a lower number!");
                } else {
                    System.out.println("Guess a higher number!");
                }
            } while (userNumber > 0 && totalAttempt != 0);
        }
        if (!isWon) {
            System.out.println("You lose");
            System.out.println("Correct number is " + chosenNumber);
        }
        System.out.println("Total left Attempt " + totalAttempt);
    }
}
