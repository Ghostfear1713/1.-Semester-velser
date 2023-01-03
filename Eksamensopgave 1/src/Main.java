import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");

        Ordleg ordleg = new Ordleg();
        System.out.println(ordleg.gentagOrd(words, 3));

    }
}