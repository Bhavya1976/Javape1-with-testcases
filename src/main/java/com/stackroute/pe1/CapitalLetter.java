package main.java.com.stackroute.pe1;

public class CapitalLetter {
    public static String checkForCapitalLetter(char input_char){

  String str="";
    // CHECKING FOR ALPHABET
        if (input_char >= 65 && input_char <= 90)
        {
            str = "Capital Letter";
        }
        else if((input_char >= 97 && input_char <= 122))
        {
            str = "Small Letter";
        }
    // CHECKING FOR DIGITS
        else if (input_char >= 48 && input_char <= 57)
        {
            str = "Digit";
        }
    // OTHERWISE SPECIAL CHARACTER
        else
            str="Special Character";
        return str;

    }

}
