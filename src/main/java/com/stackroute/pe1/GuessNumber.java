package main.java.com.stackroute.pe1;

public class GuessNumber {
    public static void numberGuess(int number,int random){


            if(number==random)
            {

                System.out.println("Number Gussed matches the original number");
            }else if(number>random)
            {
                System.out.println("Number Gussed is more than original Number");
            } else {
                System.out.println("Number Gussed is less than original Number");
            }



    }
}
