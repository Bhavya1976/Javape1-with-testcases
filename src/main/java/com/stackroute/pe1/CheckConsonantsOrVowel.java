package main.java.com.stackroute.pe1;

import java.util.Scanner;

public class CheckConsonantsOrVowel {

    public String checkForConsonantsOrVowel(String word) {
            String result="";
        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter == 'u' || letter=='A' || letter=='E'|| letter=='I' ||letter=='O' || letter=='U'){

                result += (letter + " vowel");
            }
            else if((letter > 'a' && letter < 'z' ) || (letter>'A' && letter<'Z')) {
                result += (letter + " consonant") ;
            }

        }return result.trim();

    }
}
