import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    private String name;
    private Account [] accounts = new Account[3];


    public Person(String name, int value1, int value2, int value3 ){
        this.name = name;
    }

    public void setAccountBalance(int accountNumber, int newBalance){
        accounts[accountNumber+1].setBalance(newBalance);
    }

    public Account getAccount(int accountNumber){
        return accounts[accountNumber];
    }
        //NOTE: To print Arrays we use the class Arrays and the method .toString
        // System.out.println(Arrays.toString(accounts));

    public int totalValue(){
        int sum = 0;
        for(Account a: this.accounts){
            sum = sum + a.getBalance();
        }
        return sum;
    }

























//    private String name;
//
//    private ArrayList<Integer> balances;
//
//
//    public Person(String name){
//        this.name = name;
    //TODO - Ændre linke 68 således at den tager account objekter i stedet for arraylist Integers
//        this.balances = new ArrayList<Integer>();
//    }
//
//
//    private ArrayList<Account> accounts = new ArrayList<>();
//    public ArrayList<Account> loadAccounts(){
//        Account account1 = new Account( 3000);
//        Account account2 = new Account( 2000);
//        Account account3 = new Account(1000);
//        Account account4 = new Account( 2500);
//
//        accounts.add(account1);
//        accounts.add(account2);
//        accounts.add(account3);
//        accounts.add(account4);
//
//        for (Account account: accounts) {
//            System.out.println(account);
//        }
//
//        return accounts;
//    }
//
//    public ArrayList<Integer> getBalances() {
//        return balances;
//    }
//
//    public void addBalance(int balance){
//        balances.add(balance);
//    }
//
//    //takes Person class as parameter and a object reference, person
//    public int totalValue(Person person){
//        int totalBalance = 0;
//        //iterates every balance there is on a certain object
//        for (int i : person.getBalances()) {
//            totalBalance = totalBalance + i;
//        }
//        System.out.println(totalBalance);
//        return totalBalance;
//    }


}
