import java.util.ArrayList;
import java.util.Scanner;

public class Minbrugerdialog {

    public int menuValg(ArrayList<String> array) {
        System.out.println("This is our menu");
        int i = 1;
        for (String s: array) {
            System.out.println(i + ". " + s);
            i++;
        }
        System.out.println("Which item do you want to purchase");
        Scanner choice = new Scanner(System.in);
        int userInput = choice.nextInt();
        if(userInput > array.size() || userInput <= 0){
            throw new IndexOutOfBoundsException("Wrong input");
        }

        System.out.println("You have chosen " + array.get(userInput));
        return userInput;
    }
}




