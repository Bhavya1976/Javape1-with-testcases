package main.java.com.stackroute.pe2;
import java.util.Scanner;

public class ReverseOfString {
    public String reverseString(String str){
        String reverse="";


        for (int  i=str.length()- 1;i >= 0;i--){

            reverse=reverse + str.charAt(i);
        }
        return "reverse string is:"+reverse;
    }
}
