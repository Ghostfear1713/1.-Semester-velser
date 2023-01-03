import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CaseChanger {


    public ArrayList<String> AllUpperCase(ArrayList<String> toUpperCaseList){


        ArrayList<String> upperCaseArray = new ArrayList<>();


        for(String s: toUpperCaseList){
        String l = s.toUpperCase().replaceAll(",", "");
            upperCaseArray.add(l);

        }
        return upperCaseArray;
    }



    public ArrayList<String> AllLowerCase(ArrayList<String> toLowerCaseList){
        ArrayList<String> lowerCaseArray = new ArrayList<>();
        for(String s: toLowerCaseList){
            lowerCaseArray.add(s.toLowerCase());

        }
        return lowerCaseArray;
    }





}
