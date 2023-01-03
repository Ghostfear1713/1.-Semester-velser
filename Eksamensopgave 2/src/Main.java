import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Minbrugerdialog minbrugerdialog = new Minbrugerdialog();

        ArrayList<String> option = new ArrayList<>();

        option.add("Agurk");
        option.add("Tomat");
        option.add("Salat");
        minbrugerdialog.menuValg(option);

    }
}