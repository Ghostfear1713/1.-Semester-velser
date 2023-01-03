import java.util.Scanner;

public class RepeatWords {

    public String [] userWords(int k){
        String[] words = new String[k];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<k; i++){
            System.out.println("Hvilke ord vil du gerne vil gemme");
            String userInput = scan.nextLine();
            words[i] = userInput;
        }
        return words;
    }




    public void reverseWords(String [] userWords){
        //String s = ""; - The same when we have an int = 0 just with Strings
        String [] array = new String[userWords.length];
        for(int i = 0; i < userWords.length; i++){
            // s = ou rreversedWords array - Inside our[] we insert our array again (an int). We minus that with one,
            //since the lenght of an array is always 1 above the index of an array and we -i since we wanna start
            //reversed
            array[i] = userWords[userWords.length-1-i];


        }
        System.out.println();



        // System.out.println(Arrays.toString(accounts));

        System.out.println();


    }





    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }



}
