package main.java.com.stackroute.pe1;

public class GuessNumber {

    //Method to guess the number
    public static String numberGuess(int number,int random){

         String str="";

            if(number==random)
            {

             str=  "Number Guessed matches the original number";
            }
            else if(number>random)
            {
                str="Number Guessed is more than original Number";
            }
            else {
                str="Number Guessed is less than original Number";
            }

        return str;

    }
}
