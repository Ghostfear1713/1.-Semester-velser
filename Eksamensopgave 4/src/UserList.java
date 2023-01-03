import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserList {

    private ArrayList<User> listOfUsers = new ArrayList<>();
    public ArrayList<User> loadUsers(){

        User user = new User("Caner", "Turan", "Turan@gmail.dk");
        User user1 = new User("Orhan", "Secilmis", "Orhan@gmail.dk");
        User user2 = new User("Yusuf", "Khan", "Yusuf@gmail.dk");
        User user3 = new User("Michael", "Hansen", "Michael@gmail.dk");

        listOfUsers.add(user);
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);
        System.out.println(listOfUsers);
        return listOfUsers;
    }

    public void addUser(ArrayList<User> arr) {
        ArrayList<User> userList = arr;

        String firstName = getUserInput("Enter the firstName of the User you wish to add");
        String lastName = getUserInput("Enter the lastName of the User you wish to add");
        String email = getUserInput("Enter the email of the user you wish to add");

        User user = new User(firstName, lastName, email);
        boolean addedToList = false;

            for(User u: arr){
                if(u.getEmail().equals(email)){
                    System.out.println("User has already been added to the list");
                    addedToList = true;
                }
            }
            if(!addedToList){
                arr.add(user);
                System.out.println("User has been added!");
            }
        System.out.println(arr);
        }















    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


}
