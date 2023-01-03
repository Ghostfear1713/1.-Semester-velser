import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    public User(String firstName, String lastName, String email, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public User(String email){
        this.email = email;
    }


    File file = new File("C:\\Users\\unito\\IdeaProjects\\EksamensOpgave9 1.semester\\Data\\userEmails.txt");

    public void loginViaEmail() throws FileNotFoundException {
        String email = getUserInput("Please enter your Email");


        while(true){
            for(User u: userList()){
                if(u.getEmail().equals(email)){
                    System.out.println("Login successful!");
                    break;
                }else{
                    System.out.println("Login was not successful");
                    break;
                }

            }
            break;
        }
    }

    ArrayList<User> userList()throws FileNotFoundException{

        ArrayList<User> users = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            users.add(new User(line));
        }
        return users;
    }



    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Users info: " +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", email = " + email +
                ", phoneNumber = " + phoneNumber +
                '}';
    }


    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }




}

