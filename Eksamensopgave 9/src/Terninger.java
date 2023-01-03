import java.util.Random;

public class Terninger {

    private int numberValue;

    public Terninger(int numberValue) {
        this.numberValue = numberValue;
    }

    public int kast(){
        if(this.numberValue > 6){
            throw new NumberFormatException("The given number has to be between 1 and 6");
        }
        Random random = new Random();
        this.numberValue = random.nextInt(6)+1;
        return this.numberValue;

    }

    public int getNumberValue() {
        return numberValue;
    }


}
