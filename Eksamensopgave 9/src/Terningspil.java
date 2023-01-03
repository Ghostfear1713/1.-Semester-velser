import java.util.Scanner;

public class Terningspil {

    public void terningProdukt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number do you want?");
        int userInput = scan.nextInt();


        Terninger terninger1 = new Terninger(6);
        Terninger terninger2 = new Terninger(6);

        int count = 0;
        while(true){
            if(userInput > 36){
                throw new NumberFormatException("The given number cannot exceed 36");
            }

            int dice1 = terninger1.kast();
            int dice2 = terninger2.kast();
            int sum = dice1*dice2;

            System.out.println(dice1 + " and " + dice2 + " = " + sum);

            if(sum == userInput){
                System.out.println("You have rolled the desired number " + userInput);
                System.out.println("It took you " + count + " amount of times to reach that number");
                break;
            } else{
                count++;
            }

        }

    }



}
