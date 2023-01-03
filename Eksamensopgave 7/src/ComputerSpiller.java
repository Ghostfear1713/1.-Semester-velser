import java.util.Random;

public class ComputerSpiller implements Spiller {

    @Override
    public int gætEtTal(int max) {
        Random random = new Random();

        while(true){
            //Sets max to a random value between 1 and the number we put in the parameter
            max = random.nextInt(max+1);
            break;
        }
        System.out.println(max);
        return max;


    }

}
