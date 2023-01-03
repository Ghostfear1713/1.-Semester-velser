import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbers {
    public int [] userNumberInputs(){

    //Initialize our array
    int [] numbers = new int[4];

        for(int i = 0; i < numbers.length; i++){

            int userInputs = getUserInput("Write a number");
        numbers[i] = userInputs;
        }
        System.out.println("Unfiltered array: " + Arrays.toString(numbers));
        return numbers;
    }


    public int findEvens(int[] array) {
        ArrayList<Integer> newArrayOfEvenNumbers = new ArrayList<>();

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                sum = sum + array[i];
                newArrayOfEvenNumbers.add(i);
            }
            else{

            }
        }
        System.out.println("Sum of even numbers: " + sum);
        return sum;
    }







    public static int getUserInput(String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }


}
