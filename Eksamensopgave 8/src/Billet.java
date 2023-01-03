import java.util.Date;

public class Billet {
    private String timeOfIssue;
    private int duration;
    private int pricePerHour;
    private int amountOfHours;
    private int iD;

    //private Date expirationDate;


    public int getPrice(int pricePerHour, int amountOfHours){
        int sum = pricePerHour * amountOfHours;
        return sum;
    }

    public boolean erGyldig(){
        


        return true;
    }



    @Override
    public String toString() {
        return "Ticket: " +
                "timeOfIssue =" + timeOfIssue +
                ", duration =" + duration +
                ", pricePerHour =" + pricePerHour +
                ", iD =" + iD +
                '}';
    }
}
