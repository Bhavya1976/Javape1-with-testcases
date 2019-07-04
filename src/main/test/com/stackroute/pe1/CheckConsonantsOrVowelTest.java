package main.test.com.stackroute.pe1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.com.stackroute.pe1.CheckConsonantsOrVowel;

import static org.junit.Assert.*;

public class CheckConsonantsOrVowelTest {
    CheckConsonantsOrVowel check;

    @Before
    public void setUp() {

        check = new CheckConsonantsOrVowel();
    }

    @After
    public void tearDown() {

        check = null;
    }


    @Test
    public void givenNumberShouldReturnSingleCharacterMessage() {
        //arrange


        //act
        String result = check.checkForConsonantsOrVowel(" a ");

        //assert
        assertEquals("a vowel", result);
    }

    @Test
    public void givenStringShouldReturnSingleConsonantMessage() {
        //arrange

        //act
        String result = check.checkForConsonantsOrVowel(" c ");

        //assert
        assertEquals("c consonant", result);
    }

    @Test
    public void givenStringShouldReturnMoreConsonantVowelMessage() {
        //arrange

        //act
        String result = check.checkForConsonantsOrVowel("ap");

        //assert
        assertEquals("a vowelp consonant", result);


    }

    @Test
    public void givenStringShouldReturnNullMessage() {
        //Arrange
        //Act
        String result = check.checkForConsonantsOrVowel(" ");
        //Assert
        assertEquals("", result);
    }


}

