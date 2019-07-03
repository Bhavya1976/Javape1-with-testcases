package main.java.com.stackroute.pe1;
import java.util.Scanner;

public class CharacterRepition {

    // Method Declaration
    public String repeatSubstring(String str,int number){

        String result=" ";
        String result1=" "; //String varible declaration
        for(int i=0;i<=number - 1;i++){
            result1 += str.substring(str.length() - number);  //String repition and Concatination
            result = str+result1;
        }
        return result.trim();   //returns the result and eliminates the spaces while repeating

    }
}
