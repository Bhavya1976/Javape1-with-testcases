package main.java.com.stackroute.pe1;


public class CheckingEvenOrOdd {
       public String checkingEvenOrOdd(int number) {
           String str=" ";                                                //empty string to store the result
           if (number % 2 != 0 && (number >= 20 && number <= 30)) {      //condition to check whether the given number is odd and exist between 20 and 30
                str="Tom";


           } else if( number % 2 == 0 && (number >= 20 && number <= 30)) { //Condition to check whether the given number is even and lies between 2o and 30
               str = "Jerry";

           }else {

             return "Enter the value within the limit";

           }
           return str;                                                                         // return the string.

       }

}
