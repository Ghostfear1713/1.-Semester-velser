import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class IndsamlingsInfo {

    private ArrayList<String> arr = new ArrayList<>();
    public void calculateAverage() throws Exception{
        File file = new File("C:\\Users\\unito\\IdeaProjects\\EksamensOpgave9 1.semester\\EksamensOpgave11\\IndsamlingsFil.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));



            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {

                String[] word = scan.nextLine().split(" ");
                String name = word[0];

                double sum = 0;
                for(int i = 1; i < word.length; i++){
                    sum = sum + Double.parseDouble(word[i]);
                }
                double average = sum / word.length -1;

                System.out.println(name + " har gennemsnitligt indsamlet " + average);


            }
        }
    }



