package main.test.com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import main.java.com.stackroute.pe1.CheckForCapitalLetter;

public class CheckForCapitalLetterTest {

    CheckForCapitalLetter check;
    @Before
    public void setUp(){

        check= new CheckForCapitalLetter();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        check=null;
    }


    @Test
    public void givenStringShouldReturnSmallLetterMessage(){
        //arrange


        //act
        String result=check.checkForCapital(" a ");

        //assert
        assertEquals(" a is a small letter",result);
    }

    @Test
    public void givenStringShouldReturnCapitalLetterMessage(){
        //arrange

        //act
        String result=check.checkForCapital(" A ");   //check for Capital letter in string

        //assert
        assertEquals("A is a Capital Letter",result); // prints the capital letter if found
    }

    @Test
    public void givenStringShouldReturnSymbolMessage() {
        //arrange

        //act
        String result = check.checkForCapital(" * "); //checks for symbol in string

        //assert
        assertEquals(" * is a Symbol ", result);  // Prints the symbol if found


    }

    @Test
    public void givenStringShouldReturnDigitMessage(){
        //Arrange
        //Act
        String result = check.checkForCapital(" 5 ");  //Checks for digits in string
        //Assert
        assertEquals("5 is number",result);
    }

    @Test
    public void givenStringShouldReturnNullMessage(){
        //Arrange
        //Act
        String result = check.checkForCapital(" ");  //Checks if input is null
        //Assert
        assertEquals(" ",result);   // prints the null string

    }
}