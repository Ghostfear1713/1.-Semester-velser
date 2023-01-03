import java.util.ArrayList;

public class Ordleg {
    public ArrayList<String> gentagOrd(ArrayList<String> array, int k) throws NumberFormatException{
        ArrayList<String> repeat = new ArrayList<>();


        if (k <= 0){
            throw new NumberFormatException("Invalid number - Number has to be above 0");
        }

        if (array == null){
            throw new NullPointerException("Your arraylist cannot be null");
        }

        for (String s: array){
            for(int i = 0; i < k; i++){
                repeat.add(s);
            }
        }

        return repeat;
    }




}
