import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MenneskeSpiller implements Spiller {

    private int guess;

    Random random = new Random();

    @Override
    public int gætEtTal(int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast dit gæt");
        int userInput = scan.nextInt();
        Random random = new Random();
        random.nextInt(max + 1);

        while (userInput != max) {
                if (userInput > max) {
                    System.out.println("The number you provided is above the ranged - Try again!");
                    userInput = scan.nextInt();
                }
                if (userInput < max) {
                    System.out.println("The number you provided, is below the range - Try again!");
                    userInput = scan.nextInt();
                }
                if (userInput == max) {
                    System.out.println("Congratz! You guessed the number!");
                    break;
                }
        }
        return userInput;
    }
}






