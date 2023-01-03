import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

public class ReadFiles {

    public ArrayList<String> wordReader() throws FileNotFoundException {
        //Our arraylist that will contain our words
        ArrayList<String> array = new ArrayList<>();
        //Our file that contains our txt.file
        File file = new File("C:\\Users\\unito\\IdeaProjects\\EksamensOpgave9 1.semester\\Data\\words.txt");
        //Our scanner that will run through our file for potential words/sentences
        Scanner scan = new Scanner(file);
        String line;

        while(scan.hasNextLine()){
            //reading every line and makes it to lovercase then adds it to our arraylist
            line = scan.nextLine().toLowerCase();
            array.add(line);
            System.out.println(line);
        }
        return array;
    }

    public void sortLenghtAndDublets() throws FileNotFoundException{
        //Our array that we will put all our words into
        List<String> lines = new ArrayList<>();
        File file = new File("C:\\Users\\unito\\IdeaProjects\\EksamensOpgave9 1.semester\\Data\\words.txt");
        //Our scanner that will run through our file for potential words/sentences
        Scanner scan = new Scanner(file);
        //Our string that will iterate our file for every String that's in there
        String line;

        //While there is a line in our file that it can scan/read
        while(scan.hasNextLine()){
            //Save those lines/words into our variable 'line' and then add it to our arraylist, lines
            line = scan.nextLine();
            lines.add(line);
        }

        // Count the number of times each string appears in the list
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : lines) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        // Create a new list of unique strings and sort it by length
        ArrayList<String> uniqueStrings = new ArrayList<>(countMap.keySet());
        Collections.sort(uniqueStrings, new Comparator<String>(){
            public int compare(String s1, String s2){
                return Integer.compare(s1.length(), s2.length());
            }
                });

        //Print out each string and its count
        for(String s: uniqueStrings){
            System.out.println(s + ": " + countMap.get(s));
        }

    }


}
