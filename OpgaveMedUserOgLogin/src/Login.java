import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    Scanner scan = new Scanner(System.in);

    public void login(){

        String username = getUserInput("Please enter your username");
        String password = getUserInput("Please enter your password");

        for (User u:loadUsers()) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)){
                System.out.println("Login successful!");
            }else{
                System.out.println("Login incorrect. Try again");
            }
        }


    }




    ArrayList<User> loadUsers(){
        Scanner loadUser = new Scanner("Data/users.txt");
        ArrayList<User> users = new ArrayList<>();
        try{
            while(loadUser.hasNextLine()){
            String line = loadUser.nextLine();
            //We make an array in order to split it in indexs
            String [] split = line.trim().split(";");

            /*Tilføjer objekter af User-klassen til vores arrayliste, users - Den tilføjer String parametrene i User
            constructeren - i vores tilfælde, fungere de ikke som String parametre men index'

            */
            users.add(new User(split[0], split[1], split[2]));
            }
        }catch (IllegalAccessError e){
            System.out.println("Could not read file");
        }

        return users;
    }


    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }




}
