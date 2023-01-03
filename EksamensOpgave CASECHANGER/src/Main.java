import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaseChanger caseChanger = new CaseChanger();
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("thIs");
        myArray.add("iS");
        myArray.add("spaRta");


        //System.out.println(caseChanger.AllUpperCase(myArray));
        //System.out.println(caseChanger.AllLowerCase(myArray));

            System.out.println("Vil du ændre dine ord til UpperCase eller LowerCase? Tast 1 for uppercase, tast 2 for lower");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();


            switch (userInput){
                case 1:
                    System.out.println(caseChanger.AllUpperCase(myArray));
                    break;

                case 2:
                    System.out.println(caseChanger.AllLowerCase(myArray));
                    break;

                default:
                    throw new IllegalArgumentException("Not within range");

            }



        }





    }
