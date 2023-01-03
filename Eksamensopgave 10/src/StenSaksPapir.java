import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {

    public String brugerValg(){

        String choose = getUserInput("Vil du slå Sten, saks eller papir?");

        if(choose.equalsIgnoreCase("sten")){
            return choose;
        }
        if(choose.equalsIgnoreCase("saks")){
            return choose;
        }
        if(choose.equalsIgnoreCase("Papir")){
            return choose;
        }else{
            System.out.println("Your choice is not an option. Try again!");
        }
        return choose;
    }


    public String computerValg(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(randomNumber == 0 ){
            return "Sten";
        }
        if(randomNumber == 1){
            return "Saks";
        }
        if(randomNumber == 2){
            return "Papir";
        }





        return null;
    }



    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }



}
