import java.util.Scanner;

public class TerningSpil {

    Scanner scan = new Scanner(System.in);

    public void terningProduct(){

        System.out.println("hvilket produkt vil du have?");
        int input = scan.nextInt();

        Terning dice1 = new Terning(2);
        Terning dice2 = new Terning(6);

        dice1.kast();
        dice2.kast();

        int attempts = 1;

        while(dice1.getDiceValue() * dice2.getDiceValue() != input){
        dice1.kast();
        dice2.kast();
        attempts++;
            System.out.println(dice1.getDiceValue() + " og " + dice2.getDiceValue() + " = " + dice1.getDiceValue()*dice2.getDiceValue() );

        }
        System.out.println("It took you " + attempts + " attempts to get the number you wanted!");






    }



}
