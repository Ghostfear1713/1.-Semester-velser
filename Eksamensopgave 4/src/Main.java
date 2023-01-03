import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    User user1 = new User("Orhan", "Secilmis", "Orhan@gmail.dk");

    //(user1.loginViaEmail();

    UserList userList = new UserList();
    //userList.displayUsers();
        userList.addUser(userList.loadUsers());

    }
}