import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int chosenNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Type any number");
            userNumber = sc.nextInt();
            if(userNumber == chosenNumber){
                System.out.println("BULLSEYE... CORRECT NUMBER");
                break;
            } else if (userNumber > chosenNumber) {
                System.out.println(userNumber + " is greater than the number");
            } else {
                System.out.println(userNumber + " is less than the number");
            }
        } while (userNumber >= 0);
        System.out.println("Correct number is " + chosenNumber);
    }
}
