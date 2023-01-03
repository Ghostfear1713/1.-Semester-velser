import java.util.Random;

public class Terning {
    private int diceValue;


    public Terning(int diceValue){
        this.diceValue = diceValue;
    }

    Random rand = new Random();

    public void kast(){
    this.diceValue = rand.nextInt(6) + 1;
    }

    public int getDiceValue() {
        return diceValue;
    }

}
