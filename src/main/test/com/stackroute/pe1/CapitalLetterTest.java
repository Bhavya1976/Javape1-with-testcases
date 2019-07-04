package main.test.com.stackroute.pe1;

import main.java.com.stackroute.pe1.CapitalLetter;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CapitalLetterTest {



    CapitalLetter check;
    @Before
    public void setUp(){
        //System.out.println("Before");
        check = new CapitalLetter();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        check = null;
    }

    @Test
    public void givenCharacterReturnCapitalLetterMessage(){
        //arrange


        //act
        String result=check.checkForCapitalLetter('A');

        //assert
        assertEquals("Capital Letter",result);
    }

    @Test
    public void givenCharacterShouldReturnSmallLetterMessage(){
        //arrange

        //act
        String result=check.checkForCapitalLetter('a');

        //assert
        assertEquals("Small Letter",result);
    }

    @Test
    public void  givenCharacterShouldReturnDigitMessage(){
        //arrange

        //act

        String result=check.checkForCapitalLetter('5');

        //assert
        assertEquals("Digit",result);
    }
    @Test
    public void givenCharacterShouldReturnSpecialCharacter(){
        //arrange

        //act
        String result = check.checkForCapitalLetter('$');
        //assert
        assertEquals("Special Character",result);
    }






}
